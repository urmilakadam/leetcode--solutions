import java.util.HashMap;
import java.util.Map;

public class RomanToInt13 {

    public static void main(String[] args) {
        String str ="XVIIM";
        int result = romanToInt(str);
        System.out.println(result);
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum=0;
        int n = s.length();
        for(int i=0; i<n;i++){
            if(s.charAt(i)=='I' && (i+1) != n  && (s.charAt(i+1)=='V'|| s.charAt(i+1)=='X')){
                sum = sum + map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }else if(s.charAt(i)=='X' && (i+1) != n  && (s.charAt(i+1)=='L'|| s.charAt(i+1)=='C')){
                sum = sum + map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }
            else if(s.charAt(i)=='C' && (i+1) != n  && (s.charAt(i+1)=='D'|| s.charAt(i+1)=='M')){
                sum = sum + map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }else{
                sum = sum + map.get(s.charAt(i));
            }
        }
        return sum;
    }

    private static int romanToInt1(String s)
    {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        int n = s.length();

        for(int i = 0; i < n; i++)
        {

            if (i != n - 1 && roman.get(s.charAt(i)) <
                    roman.get(s.charAt(i + 1)))
            {
                sum += roman.get(s.charAt(i + 1)) -
                        roman.get(s.charAt(i));
                i++;
            }
            else
            {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }
}
