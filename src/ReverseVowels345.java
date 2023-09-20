import java.util.Arrays;

public class ReverseVowels345 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int first = 0, last = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] array = s.toCharArray();

        while(first < last){
            if(vowels.contains(array[first]+"")){
                if(vowels.contains(array[last]+"")){
                    char ch = array[first];
                    array[first] = array[last];
                    array[last] = ch;
                    first++;
                }
                last--;
            }else{
                first++;
            }
        }
        return String.valueOf(array);
    }
}
