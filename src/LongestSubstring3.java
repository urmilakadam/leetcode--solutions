import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstring3 {

    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring1(String s) {

        int maximum=0;

        for(int i=0; i< s.length(); i++){
            String temp="";
            int count = 0;
            for(int j=i; j< s.length(); j++){
                if(temp.contains(s.substring(j,j+1))){
                    break;
                }
                temp = temp + s.substring(j,j+1);
                count++;
            }
            if(count > maximum)
                maximum= count;
        }
        return maximum;
    }

    public static int lengthOfLongestSubstring(String s) {

        int left=0, right=0;
        int maximum=0;
        Set<Character> set= new HashSet<>();

        while(right < s.length()){
            char c = s.charAt(right);
            if(set.add(c)){
                maximum = Math.max(maximum, right-left+1);
                right++;
            }else{
                while(s.charAt(left) != c){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(c);
                left++;
            }
        }

        return maximum;
    }
}
