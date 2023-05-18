public class ReverseInteger7 {

    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;

        int result = reverse(num);
        System.out.println(result);
    }

    public static int reverse(int x) {

        boolean isNegative = x < 0 ? true : false;
        if(isNegative){
            x = x * -1;
        }
        StringBuilder value = new StringBuilder(x).reverse();
        return Long.parseLong(String.valueOf(value)) > Integer.MAX_VALUE ? 0 : isNegative == true? Integer.parseInt(String.valueOf(value)) * -1 :
                Integer.parseInt(String.valueOf(value));
    }
}
