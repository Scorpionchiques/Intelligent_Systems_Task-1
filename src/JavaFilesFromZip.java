import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Class that unzips a file and then finds every .java file that contains "transient" or "volatile"
 */
public class JavaFilesFromZip {
    public static String unzip(String fileName){

    File zipFile = new File(fileName);

    String folderPath=zipFile.getParent();
    String folderName=folderPath+zipFile.getName().split(".zip")[0];

    File directory = new File(folderName);
    directory.mkdir();
    ZipUtils.extract(zipFile, new File(folderName));
    return  folderName;
    }

    public static List<Path> checkJavaFiles(String folderName) throws IOException {
        List<Path> result = new ArrayList<>();
        Path path = Paths.get(folderName);
        Stream<Path> fileStream = Files.walk(path).filter(x -> x.toString().endsWith(".java"));
        fileStream.forEach((Path file)->{
            try {
                Stream<String> fileLinesStream = Files.lines(file);
                if (fileLinesStream.anyMatch(line -> line.contains("transient") || line.contains("volatile"))){
                    result.add(file);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        });
        return result;
    }
}
