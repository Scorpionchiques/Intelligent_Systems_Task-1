import java.io.IOException;

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
    public static void Task3(String hex){

        System.out.println(Long.decode("0x" + hex));
    }


    public static void Task6(char c, String file_path) throws IOException {
        System.out.println(Character_Counter.counter(c, file_path));
    }
    public static void Task7(int n, String file_path) throws IOException {
        for (String line : Random_lines.getList(n, file_path)) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws IOException {
        //Task1(500,-200);
        //Task2(args[0]);
        //Task3("22273E1");

        //Task6('E', "test.txt");
        //Task7(args[1], args[0]);
    }
}
