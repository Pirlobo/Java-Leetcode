import java.util.Stack;
public class Parenthesis {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char currentValue = expression.charAt(i);
            if (currentValue == '(' || currentValue == '{' || currentValue == '[') {
                stack.push(currentValue);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }    
            char poppedItem = stack.pop();
            switch (currentValue) {
                case ')':
                    if (poppedItem != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (poppedItem != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (poppedItem != '[') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}
