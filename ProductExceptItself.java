import java.util.*;
public class ProductExceptItself {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        int[] answer = duma(nums);
        for (int i : answer) {
            System.out.println(i);
        }
    }
    public static int[] findProductExceptItSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            int low = 0;
            int high = nums.length - 1;
            // 0 1 2 3 
            // 1 2 3 4 
            while (low < high) {
                if (low < i) {
                    product *= nums[low];
                    low++;
                }
                if(high > i){
                    product *= nums[high];
                    high--;
                }
            }
            answer[i] = product;
        }
        return answer;
    }
    public static int[] duma(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        for (int i = left.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        for (int i = 0; i < output.length; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }
}
