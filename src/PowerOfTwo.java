public class PowerOfTwo {

    public static void main(String[] args) {
        int num = 2048;
        System.out.println(isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int n) {

        for(int i=0; i<= n/4 + 1 ; i++){
            double num = Math.pow(2,i);
            if(num == n)
                return true;
            else if(num > n)
                return false;
        }
        return false;
    }
}
