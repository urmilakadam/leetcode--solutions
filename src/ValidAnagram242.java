import java.util.Arrays;

public class ValidAnagram242 {

    public static void main(String[] args) {

    }

    public boolean isAnagram1(String s, String t) {

        if(s.length() != t.length()) return false;
        int[] table = new int[26];

        for(char c : s.toCharArray()){
            table[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            table[c - 'a']++;
        }

        for(int i = 0; i< table.length; i++){
            if(table[i] != 0) return false;
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        s = new String(c1);
        t = new String(c2);

        return s.equals(t);

    }
}
