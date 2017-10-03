import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.io.*;

public class Random_lines {

    static List<String> getList(int N, String filename) throws IOException{

        int lineLength = 50;
        File txt_file = new File(filename);
        List<String> fileList = new ArrayList<String>((int) (txt_file.length() / lineLength) * 2);

        int lineCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(txt_file));
        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            fileList.add(line);
            lineCount++;
        }
        reader.close();


        List<String> result = new ArrayList<String>(N);
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            result.add(fileList.get(r.nextInt(lineCount - 1)));
        }

        return result;

    }
}
