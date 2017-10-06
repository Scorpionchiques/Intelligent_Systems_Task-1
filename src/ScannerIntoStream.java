import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.function.IntSupplier;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ScannerIntoStream{
    public static class intoInt{

        Scanner scan;
        intoInt(InputStream in) {
            scan = new Scanner(in);
        }
        IntSupplier supplier = ()->{
            return scan.nextInt();
        };
        IntStream stream(){
            return IntStream.generate(supplier);
        }
    }
    public static class intoDouble{

        Scanner scan;
        intoDouble(InputStream in) {
            scan = new Scanner(in);
        }
        DoubleSupplier supplier = ()->{
            return scan.nextDouble();
        };
        DoubleStream stream(){
            return DoubleStream.generate(supplier);
        }
    }
    public static class intoString{

        Scanner scan;
        intoString(InputStream in) {
            scan = new Scanner(in);
        }
        Supplier<java.lang.String> supplier = ()->{
            return "" + scan.next();
        };
        Stream stream(){
            return Stream.generate(supplier);
        }
    }
    public static class intoLine{

        Scanner scan;
        intoLine(InputStream in) {
            scan = new Scanner(in);
        }
        Supplier<java.lang.String> supplier = ()->{
            return "" + scan.nextLine();
        };
        Stream stream(){
            return Stream.generate(supplier);
        }
    }
}
