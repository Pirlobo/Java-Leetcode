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
        Queue<String> queue
            = new LinkedList<>();
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
        queue.add("");
        for(int i = 0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            char[] array = mapping[index].toCharArray();
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String prev = queue.remove();
                for (char c : array) {
                    queue.add(prev + c);
                }
            }
        }
        ArrayList list = new ArrayList(queue);
            // letterCombinations(result, digits, "", 0, mapping);
        return list;
    }
   public static void letterCombinations(List<String> result, String digits, String current, int index, String[] mapping) {
       if(index == digits.length()) {
           result.add(current);
           return;
       }
       String letters = mapping[digits.charAt(index) - '0'];
       for (int i = 0; i < letters.length(); i++) {
           letterCombinations(result, digits, current + letters.charAt(i), index+1, mapping);
       }
   }
}
