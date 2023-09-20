import java.util.ArrayList;
import java.util.List;

public class ExcelColumn171 {

    public static void main(String[] args) {
        String s = "K1:L2";
        System.out.println(cellsInRange(s));
    }

    public static List<String> cellsInRange(String s) {

        char c1 = s.charAt(0);
        char r1 = s.charAt(1);
        char c2 = s.charAt(3);
        char r2 = s.charAt(4);

        List<String> result = new ArrayList<String>();

        for(int i = c1; i <= c2; i++){
            for (int j = r1; j <= r2; j++) {
                result.add(Character.toString(i) + Character.toString(j)) ;
            }
        }
        return result;
    }
}
