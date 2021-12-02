import java.util.*;
public class Permuations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> numbers = permute(nums);
        for (List<Integer> list : numbers) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if (nums.length == 0 || nums == null) return output;
        // If string is empty
        boolean[] used = new boolean[nums.length];
        List<Integer> permuatation = new ArrayList<Integer>();
        helper(nums, permuatation, used, output);
        return output;
    }
    public static void helper(int[] nums, List<Integer> permutation, boolean[] used,                 List<List<Integer>> output) {
        if (permutation.size() == nums.length) {
            output.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0 ; i < nums.length; i++) {
            if(used[i])
                continue;
            used[i] = true;
            permutation.add(nums[i]);
            helper(nums, permutation, used, output);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }
    }
}
