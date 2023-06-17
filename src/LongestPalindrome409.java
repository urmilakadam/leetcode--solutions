import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome409 {
    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));
    }

    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int result=0;

        for(char c : s.toCharArray()){
            if(!set.add(c)) {
                result = result + 2;
                set.remove(c);
            }
        }
        if(s.length() > result) result++;
        return result;
    }
}
