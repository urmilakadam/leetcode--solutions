public class ReverseWords557 {

    public static void main(String[] args) {
        String str = "This is problem statement";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {

        char[] charArray = s.toCharArray();

        for(int i=0; i<s.length(); i++) {

            int low = i;
            while(++i < s.length() && charArray[i] != ' ');
            int high = i - 1;

            while (high > low) {
                char c = charArray[high];
                charArray[high] = charArray[low];
                charArray[low] = c;
                high--;
                low++;
            }
        }
        return new String(charArray);
    }

}
