import static java.lang.Math.abs;
import static java.lang.Math.floorMod;
/**
 * Non-recursive implementation of GCD's algorithm with three different operations
 */
class Euclidean_algorithm {

    public static int percent(int a, int b) {
        a = (a < 0)? -a: a;
        b = (b < 0)? -b: b;
        while (b != 0)
            b = a % (a = b);
        return a;
    }

    public static int floor_Mod(int a, int b) {
        if (b == 0) return (a > 0)? a: -a;
        b = (b < 0)? -b: b;
        while (b != 0)
            b = floorMod(a,(a=b));
        return a;
    }

    public static int rem(int a, int b) {
        if (b == 0) return (a > 0)? a: -a;
        b = (b < 0)? -b: b;
        while (b != 0)
            b = abs(a % (a=b));
        return a;
    }
}