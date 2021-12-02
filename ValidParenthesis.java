import java.util.*;
 
public class ValidParenthesis {
    public static boolean isValid(String s)
    {
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check != '(')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check != '{')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check != '[')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }
}