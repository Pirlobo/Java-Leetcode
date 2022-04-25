import java.util.*;
public class RemoveKDigits {
    static int m = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // System.out.println(removeKdigits("112", 1));
        remove("133313", 3);
    }
    public static void remove(String num, int k) {
        Stack<Character> stack = new Stack<Character>();
        int idx = 0 ;
        while (idx < num.length()) {
            while (k > 0 && !stack.isEmpty() && Integer.valueOf(num.charAt(idx)) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(idx++));
        }
        while(k < 0) {
            stack.pop();
            k--;
        }
    }
}
