import java.util.*;
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] array = {23,2,4,6,7};
        System.out.println(checkSubarraySum(array, 6));
    }
    public static int checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int result = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum-k)) {
                result += map.get(sum-k);
            }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
