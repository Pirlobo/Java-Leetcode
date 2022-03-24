import java.util.*;
public class Subset {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,3};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, nums, new ArrayList<>(), result);
        return result; 
        }
    public static void backTrack(int start, int[] numbers, 
    ArrayList<Integer> current, List<List<Integer>> subset) {
        subset.add(new ArrayList<Integer>(current));
        for (int i = start ; i < numbers.length; i++) {
            current.add(numbers[i]);
            backTrack(i+1, numbers, current, subset);
            current.remove(current.size() - 1);
        }

    }
}
