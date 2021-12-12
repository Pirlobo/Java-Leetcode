import static java.lang.Math.*;
public class MaxProductSubArray{
    public static void main(String[] args) {
        int[] nums = {-2,1,3,4,-2};
        maxProductSubArray(nums);
    }
    public static int maxProductSubArray(int[] nums) {
       int max_overall = nums[0];
       int max_ending = nums[0];
       int min_ending = nums[0];

       for(int i = 1; i < nums.length; i++) {
           int tempt = max_ending;
           max_ending = Math.max(nums[i], Math.max(nums[i] * max_ending, nums[i] * min_ending));
           min_ending = Math.min(nums[i], Math.min(nums[i] * tempt, nums[i] * min_ending));
           max_overall = Math.max(max_overall, max_ending);
       }
       return max_overall;
    }
}