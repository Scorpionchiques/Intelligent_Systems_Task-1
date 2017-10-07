import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Class to count character in file
 */

public class Character_Counter {

    public static int counter(char c, String file_path) throws IOException {
        String contents = Files.lines(Paths.get(file_path)).collect(Collectors.joining("\n"));
        Pattern pattern = Pattern.compile("(["+c+"])");
        Matcher matcher = pattern.matcher(contents);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }

}
