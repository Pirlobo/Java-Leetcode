import java.util.Stack;

public class BasicCalculations {
    public static void main(String[] args) {
        String expression = "2+8+(4-3)";
        System.out.println(calculate(expression));
    }
    public static int calculate(String s) {
        s.replaceAll("\\s", "");
        int sign = 1;
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int num = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num*10 + (s.charAt(i) - '0');
                    i++;
                }
                sum = sum + num*sign;
                /// 999 => i points at 2, then increment by 1 in the while loop
                // for increment by 1 => i becomes 4, then we have to decrement by 1
                i--;
            }
            else if (s.charAt(i) == '(') {
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
            }
            else if (s.charAt(i) == ')') {
                // sign * sum , to change the sign if needed then add to the current sum
                sum = stack.pop()*sum +  stack.pop();
            }
            else if (s.charAt(i) == '-') {
                sign = -1;
            }
            else if (s.charAt(i) == '+') {
                sign = 1;
            }
        }
        return sum;
    }
}
