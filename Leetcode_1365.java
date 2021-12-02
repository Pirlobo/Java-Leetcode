import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Leetcode_1365 {

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copiedArray = nums.clone();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Arrays.sort(nums);
        int result;
        for (int i = nums.length - 1; i >= 0; i--) {
            result = i;
            map.put(nums[i], result);
        }
        // System.out.println(entry.getKey() + ":" + entry.getValue());

        int[] output = new int[copiedArray.length];
        for (int i = 0; i < copiedArray.length; i++) {
            int value = map.get(copiedArray[i]);
            output[i] = value;
        }
        return output;
        
    }
}
