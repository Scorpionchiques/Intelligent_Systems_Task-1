import java.util.stream.Stream;

public class StreamOfRandomNumbers {
    public static Stream<Long> getStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, e->(a*e+c)%m);
    }
}
