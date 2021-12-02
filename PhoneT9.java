import java.util.*;
public class PhoneT9 {
    public static void main(String[] args) {
        String s = "23";
        List<String> list = letterCombinations(s);
        for (String string : list) {
            System.out.println(string);
        }
    }
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<String>();
        if (digits.length() == 0) return result;
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        result.add("");
        for(int i = 0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            char[] array = mapping[index].toCharArray();
            while(result.peek().length() == i) {
                String previous = result.remove();
                for(char c : array){
                    result.add(previous + c);
                }
            }
        }
        return result;
    }
   
}
