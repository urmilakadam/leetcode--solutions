import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSubsets916 {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"lo","eo"};

        wordSubsets(words1, words2).stream().forEach(System.out::println);
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<words1.length; i++){
            int count = 0;
            for(int j=0; j<words2.length; j++){
                char[] input1 = words1[i].toCharArray();
                Arrays.sort(input1);
                char[] input2  = words2[j].toCharArray();
                Arrays.sort(input2);
                if(!String.valueOf(input1).contains(String.valueOf(input2))) break;
                count++;

            }
            if(count == words2.length) list.add(words1[i]);
        }
        return list;
    }
}
