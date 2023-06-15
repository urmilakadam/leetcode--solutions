public class DoubleReversal2119 {

    public static void main(String[] args) {

    }

    public boolean isSameAfterReversals(int num) {
        String s = String.valueOf(num);
        if(s.length() == 1) return true;
        else return !s.endsWith("0");
    }
}
