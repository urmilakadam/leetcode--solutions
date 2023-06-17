import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInString438 {

    public static void main(String[] args) {
        String s = "abab", p = "ab";
        findAnagrams(s, p).forEach(System.out::println);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] input2 = p.toCharArray();
        Arrays.sort(input2);

        for(int i=0; i<s.length() - p.length()+1; i++){
            String str = s.substring(i, i+p.length());
            char[] input1 = str.toCharArray();
            Arrays.sort(input1);
            if(String.valueOf(input1).equals(String.valueOf(input2))) list.add(i);
        }

        return list;
    }
}
