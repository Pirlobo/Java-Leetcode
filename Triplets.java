import java.util.*;
public class Triplets {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        int threshold = 8;
        System.out.println(printAllTriplets(8, numbers));
    }
    
    public static long printAllTriplets(int threshold, List<Integer> numbers)
    {
        long count = 0;
        int[] nums = new int[numbers.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numbers.get(i);
        }
        // sort the array in ascending order
        Arrays.sort(nums);
 
        // check if triplet is formed by `nums[i]` and a pair from
        // subarray `nums[i+1…n)`
        for (int i = 0; i <= nums.length - 3; i++)
        {
            // maintain two indexes pointing to endpoints of the
            // subarray `nums[i+1…n)`
            int low = i + 1, high = nums.length - 1;
 
            // loop if `low` is less than `high`
            while (low < high)
            {
                // decrement `high` if the total is more than the remaining sum
                if (nums[i] + nums[low] + nums[high] > threshold) {
                    high--;
                }
                else {
                    // if the total is less than or equal to the remaining sum,
                    // print all triplets
                    for (int x = low + 1; x <= high; x++)
                    {
                        count++;
                    }
 
                    low++;        // increment low
                }
            }
        }
        return count;
    }
}