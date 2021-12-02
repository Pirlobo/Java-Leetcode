import java.util.*;

class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
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
        // Set<String> set = new HashSet<String>();
        // List<List<Integer>> resultList = new ArrayList<>();
        // for (int j = 0; j < nums.length; j++) {
        //     int target = -nums[j];
        //     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //     for (int i = 0; i < nums.length; i++) {
        //         if (i == j)
        //             continue;
        //         int difference = target - nums[i];
        //         if (!map.containsKey(difference)) {
        //             map.put(nums[i], i);
        //         } else {
        //             List<Integer> ans = Arrays.asList(nums[j],nums[map.get(difference)],nums[i]);
        //             Collections.sort(ans);
        //             String current = String.valueOf(ans.get(0)) + String.valueOf(ans.get(1))
        //                     + String.valueOf(ans.get(2));
        //             if (set.contains(current)) {
        //                 continue;
        //             } else {
        //                 resultList.add(ans);
        //                 set.add(current);
        //             }
        //             ;
        //         }
        //     }
        // }
        // return resultList;
}
        return resultList;
    }
}