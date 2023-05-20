import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class DeleteOperation583 {

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0, right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
