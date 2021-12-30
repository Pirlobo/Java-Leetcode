import java.util.*;

public class EvaluateReversePosition {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String current = tokens[i];
            if(isNumber(current)){
                int num = Integer.parseInt(current);
                list.add(num);
            }else{
                int lastSecondElement = list.remove(list.size() - 2);
                int lastElement = list.remove(list.size() - 1);
                switch (current) {
                    case "+":
                        list.add(lastSecondElement + lastElement);
                        break;
                    case "-":
                        list.add(lastSecondElement - lastElement);
                        break;
                    case "*":
                        list.add(lastSecondElement * lastElement);
                        break;
                    case "/":
                        list.add(lastSecondElement / lastElement);
                        break;
                    default:
                        break;
                }
            }
        }
        return list.get(0);
    }

    public static boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
            return false;
        }
    }
}