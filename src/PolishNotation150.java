import java.util.Objects;
import java.util.Stack;

public class PolishNotation150 {
    public static void main(String[] args) {
        String []tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String str : tokens){
            switch (str) {
                case "+": {
                    stack.push(stack.pop() + stack.pop());
                    break;
                }
                case "-": {
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    stack.push(value2 - value1);
                    break;
                }
                case "*": {
                    stack.push(stack.pop() * stack.pop());
                    break;
                }
                case "/": {
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    stack.push(value2 / value1);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }
        return stack.pop();
    }
}
