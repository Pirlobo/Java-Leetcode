import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_34 {
public static int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    int start = findingTheLeftMost(nums, target);
    int end = findingTheRightMost(nums, target);
    result[0] = start;
    result[1] = end;
    return result;
}
public static int findingTheLeftMost(int[] nums, int target) {
   int index = -1;
   int start = 0;
   int end = nums.length - 1;
   while (start <= end) {
       int midpoint = start + (end - start) / 2;
       if (nums[midpoint] >= target) {
           end = midpoint - 1;
       }
       else {
           start = midpoint + 1;
       }
       if (nums[midpoint] == target) {
        index = midpoint;
    }
   }
   return index;
}
public static int findingTheRightMost(int[] nums, int target) {
    int index = -1;
    int start = 0;
   int end = nums.length - 1;
    while (start <= end) {
        int midpoint = start + (end - start) / 2;
        if (nums[midpoint] <= target) {
            start = midpoint + 1;
        }
        else {
            end = midpoint - 1;
        }
        if (nums[midpoint] == target) {
            index = midpoint;
        }
    }
    return index;
 }
}
