import java.util.*;
public class GenerateParenthesis {
    public static void main(String[] args) {
        generateParenthesis(3);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<String>();
        backTracking(output, "", 0, 0, n);
        return output;
    }
    
    public static void backTracking(List<String> output, String current, int open, int close, int max) {
        if (current.length() == max*2){
            output.add(current);
            return;
        }
        if(open < max) backTracking(output, current + "(", open+1, close, max);
        if(close < open) backTracking(output, current + ")", open, close + 1, max);
    }
}
