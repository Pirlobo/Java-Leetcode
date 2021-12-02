import java.util.*;
public class FirstDuplicate {
    public static void main(String[] args) {
        int[] testCase1 = {2,1,3,5,3,2};
        int[] testCase2 = {1,2,1,2,3,3};
        int[] testCase3 = {1,2,3, 4, 5, 6};
        System.out.println(findDuplicate(testCase2));
    }
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            }
            else {
                set.add(nums[i]);    
            }
            
        }
        return 0;
    }
}
