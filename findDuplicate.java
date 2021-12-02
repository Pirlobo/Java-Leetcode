import java.util.HashMap;
public class findDuplicate {
    public static int firstDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
            else {
                return nums[i];
            }
        }
        return 0;
    }
}
