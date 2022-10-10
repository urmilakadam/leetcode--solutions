import java.util.Arrays;

public class HammingWeight {

    public static void main(String[] args) {
        int num = 00000000000000000000000000001011;
        System.out.println(hammingWeight(num));
    }

    public  static  int hammingWeight(int n) {

        String str = Integer.toBinaryString(n);
        return (int) Arrays.stream(str.split("")).filter(p -> p.equals("1")).count();
    }
}
