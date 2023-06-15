import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordPattern290 {

    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] s1 = s.split(" ");
        if(s1.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for(int  i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(s1[i])) {
                    return false;
                }
            }
            else{
                if(map.containsValue(s1[i])){
                    return false;
                }
                map.put(pattern.charAt(i), s1[i]);
            }
        }
        return true;
    }
}
