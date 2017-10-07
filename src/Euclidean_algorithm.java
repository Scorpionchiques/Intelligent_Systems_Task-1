import static java.lang.Math.abs;
import static java.lang.Math.floorMod;
/**
 * Non-recursive implementation of GCD's algorithm with three different operations
 */
class Euclidean_algorithm {

    public static int percent(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a < 0 ? -a : a;
    }

    public static int floor_Mod(int a, int b) {
        while (b != 0)
            b = floorMod(a,(a=b));
        return a < 0 ? -a : a;
    }

    public static int rem(int a, int b) {
        while (b != 0)
            b = abs(a % (a=b));
        return a < 0 ? -a : a;
    }
}