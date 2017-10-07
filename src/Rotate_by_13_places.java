/**
 * Implementation of the ROT13 algorithm encoder/decoder for the english alphabet
 */
class Rotate_by_13_places{
    public static String encode_decode(String s){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            output.append(c);
        }
        return output.toString();
    }
}