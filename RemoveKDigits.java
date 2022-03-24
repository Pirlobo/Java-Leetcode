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
    public static String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        int[] arr = new int[num.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(num.charAt(i));
        }   
        subsets(arr, k);
        return String.valueOf(m);
    }
    public static List<List<Integer>> subsets(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, nums, new ArrayList<>(), result, k);
        return result; 
        }
    public static void backTrack(int start, int[] numbers, 
    ArrayList<Integer> current, List<List<Integer>> subset, int k) {
        String min = "";
        if (current.size() == numbers.length - k) {
            for (int i = 0; i < numbers.length - k; i++) {
                min += String.valueOf(current.get(i));
            }
            int convert = Integer.valueOf(min);
            m = Math.min(m, convert);
        }
        for (int i = start ; i < numbers.length; i++) {
            current.add(numbers[i]);
            backTrack(i+1, numbers, current, subset, k);
            current.remove(current.size() - 1);
        }

    }
}
