/**
 * LetterPhoneGenerator
 */
import java.util.*;
public class LetterPhoneGenerator {

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
}