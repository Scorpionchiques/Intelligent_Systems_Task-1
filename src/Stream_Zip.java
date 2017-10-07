import java.util.stream.Stream;

/**
 * Class for merge two  streams into one stream that alternates their elements
 */

public class Stream_Zip{
        public static Stream zip(Stream first_Stream, Stream second_Stream){
            Stream.Builder<Object> zipped =Stream.builder();
            Object[] first_List= first_Stream.toArray();
            Object[] second_List = second_Stream.toArray();
            int length = Math.min(first_List.length, second_List.length);
            for (int i = 0; i < length; ++i){
                zipped.add(first_List[i]);
                zipped.add(second_List[i]);
            }
            return zipped.build();
        }
    }
