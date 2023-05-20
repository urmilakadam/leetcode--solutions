
public class ValidPolindrom680 {

    public static void main(String[] args) {
        String haystack ="mississippi";
        String needle ="issip";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }

        return -1;
    }
}
