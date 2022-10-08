import java.util.Arrays;

public class ReverseString344 {

    public static void main(String[] args) {
        char arr[] = {'u', 'r', 'm', 'i', 'l', 'a'};
        char[] result = reverseString(arr);
        System.out.println(Arrays.toString(result));
    }

    public static char[] reverseString(char[] s) {
        int high = s.length-1;
        int low = 0;

        while(high > low){

            char c = s[high];
            s[high] = s[low];
            s[low] = c;
            high--;
            low++;
        }
        return s;
    }
}
