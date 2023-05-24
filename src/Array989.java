import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array989 {
    public static void main(String[] args) {
        int[] nums = {0};
        int k= 10000;
        addToArrayForm(nums, k).stream().forEach(System.out::println);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        int count = num.length - 1, carry = k;
        List<Integer> list = new ArrayList<>();

        while(count >= 0){
            int sum = (num[count] + carry) % 10;
            list.add(sum);
            carry = (num[count] + carry) / 10;
            count --;
        }
        while(carry> 0){
            list.add(carry%10);
            carry = carry / 10;
        }
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> addToArrayForm1(int[] num, int k) {
        StringBuilder s = new StringBuilder();
        for (int j : num) {
            s.append(j);
        }
        String num1 = s.toString();
        String num2 = String.valueOf(k);

        int count1 = num1.length() - 1;
        int count2 = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(count1 >=0 || count2 >=0 || carry == 1){
            int digit1 = (count1 >= 0) ? num1.charAt(count1) - '0' : 0;
            int digit2 = (count2 >= 0) ? num2.charAt(count2) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            result.insert(0, digit);

            count1--;
            count2--;
        }

        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i<result.length(); i++){
            list.add(Integer.valueOf(result.charAt(i)+""));
        }
        return list;
    }
}
