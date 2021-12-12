import java.util.*;
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int size = nums.length;

        // Time Complexity = O(nlogn)
        // Arrays.sort(nums);
        // if(nums[size - 1] != size) return size;
        // if(nums[0] != 0) return 0;
        // for(int i = 0 ; i < size - 1; i++){
        //     if(nums[i+1] - nums[i] > 1) return nums[i] + 1; 
        // }
        // return 0;
        
        // Time Complexity = O(n)
        int total = (size*(size+1))/2;
        int totalButMissing = 0;
        for(int i = 0 ; i < size; i++){
            totalButMissing += nums[i];
        }
        return total - totalButMissing;
    }
}
