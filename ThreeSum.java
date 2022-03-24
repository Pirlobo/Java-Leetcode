import java.util.*;

class ThreeSum {

    public static void main(String[] args) {
        int[] nums = { -1,0,1,2,-1,-4 };
        List<List<Integer>> resultList = threeSum(nums);
        for (List<Integer> var : resultList) {
            System.out.println(var);
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // [-4, -1, 1 0 ]
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return resultList;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i - 1] != nums[i])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = -(nums[i]);
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        resultList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1])
                            low++;

                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return resultList;
    }
}