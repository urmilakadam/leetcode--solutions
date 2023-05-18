import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FirstLetterToAppearTwice2351 {

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int bound = s.length();
        for (int i = 0; i < bound; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }

        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 2) return ch;
        }
            return 'a';
    }

    public static String longestCommonPrefix(String[] strs) {
        boolean flag =false;
        int count=0;

        while(count < strs[0].length()){
            for(int i = 1; i < strs.length; i++){
                if(strs[i].length() > count) {
                    if (strs[0].charAt(count) != strs[i].charAt(count)) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag == true) break;
            count++;
        }

        if(count == 0) return "";
        return strs[0].substring(0,count);
    }
}
