import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void Task1(int a, int b){
        System.out.println(Euclidean_algorithm.percent(a, b));
        System.out.println(Euclidean_algorithm.floor_Mod(a, b));
        System.out.println(Euclidean_algorithm.rem(a, b));
    }
    public static void Task2(String Str){
        String S = Rotate_by_13_places.encode_decode(Str);
        System.out.println(S);
        System.out.println(Rotate_by_13_places.encode_decode(S));
    }

    /**
     * Function for translating hexadecimal numbers to decimal
     */
    public static void Task3(String hex){

        System.out.println(Long.decode("0x" + hex));
        System.out.println(Hex2dec.hex2decimal(hex));
    }


    public static void Task4(){

        ScannerIntoStream.intoInt A= new ScannerIntoStream.intoInt(System.in);
        Stream<Integer> stream = A.stream();
        stream.limit(5).forEach(x->System.out.println(x));

    }

    public static void Task5() throws IOException {

        String folderName=JavaFilesFromZip.unzip("/Users/Zharkov/Documents/src.zip");

        List<Path> A = JavaFilesFromZip.checkJavaFiles(folderName);

        for (Path i:A
             ) {
            System.out.println(i.toString());
        }

    }

    public static void Task6(char c, String file_path) throws IOException {
        System.out.println(Character_Counter.counter(c, file_path));
    }
    public static void Task7(int n, String file_path) throws IOException {
        for (String line : Random_lines.getList(n, file_path)) {
            System.out.println(line);
        }
    }
    public static void Task8(Long seed, Long a, Long c, Long m, int n){
        Stream<Long> r_stream = StreamOfRandomNumbers.getStream(seed, a, c, m);
        r_stream.limit(n).forEach(System.out::println);
    }
    public static void Task9(){
        String[] arr1 = { "program", "creek", "program", "creek", "java", "web",
                "program" };
        Stream f_stream = Stream.of(arr1);
        String[] arr2 = {"a", "b", "c", "d"};
        Stream s_stream = Stream.of(arr2);
        Stream zipped_Stream=Stream_Zip.zip(f_stream, s_stream);
        zipped_Stream.forEach(System.out::println);

    }
    public static void main(String[] args) throws IOException {
        //Task1(-10,-5);
        Task2("PriVet - - -");
        //Task3("22273E1");
         //Task4();
         //Task5();
        //Task6('E', "test.txt");
        //Task7(5, "test.txt");
        //Task8(256L,25214903917L,11L,2^48L,30);

        //Task9();
    }
}
