public class ReverseWords151 {

    public static void main(String[] args) {

    }

    public static String reverseWords(String s) {
        String [] str = s.split(" ");
        int left=0, right = str.length-1;

        while(left < right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", str);
    }
}
