import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Class for merge two  streams into one stream that alternates their elements
 */

public class Stream_Zip{
        public static Stream zip(Stream first_Stream, Stream second_Stream){
            Stream.Builder<Object> zipped =Stream.builder();
            Iterator first_iter = first_Stream.iterator();
            Iterator second_iter = second_Stream.iterator();
            while(first_iter.hasNext() && second_iter.hasNext()){
                zipped.add(first_iter.next());
                zipped.add(second_iter.next());
            }
            return zipped.build();
        }
    }
