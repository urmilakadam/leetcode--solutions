public class LemonadeChange860 {
    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int change = 0;
        boolean result = true;

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5) change +=5;
            else if(change <= 0 || (bills[i] - 5) > change) return false;
            else change = change + bills[i] - 5;
        }
        return result;
    }
}
