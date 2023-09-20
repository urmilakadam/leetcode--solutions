import java.util.Stack;

public class SquaresOfSortedArray977 {

    public static void main(String[] args) {
        String s = "ab##", t = "c#d#";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {

        return check(s).equals(check(t));
    }

    private static String check(String input){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) !='#')
                stack.push(input.charAt(i));
            else if(!stack.isEmpty())
                stack.pop();
        }
        return String.valueOf(stack);
    }
}
