import java.util.stream.Stream;

/**
 * Class that generates an infinite stream of random numbers, realizing a linear congruential generator
 */

public class StreamOfRandomNumbers {
    public static Stream<Long> getStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, e->(a*e+c)%m);
    }
}
