import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        // keep adding to get current Sum, if nums[i] > current Sum, then skip to i.
        int[] nums = {1,-1,2,0};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int current_sum = max;
        for (int i = 1; i < nums.length; i++){
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max = Math.max(max, current_sum);
        }
        return max;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i; j < nums.length; j++) {
        //         int total = 0;
        //         for (int j2 = i; j2 <= j; j2++) {
        //             total += nums[j2];
        //         }
        //         if (total > sum) {
        //             sum = total;
        //         }
        //     }
        // }
       
    }
}
