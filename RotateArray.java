import java.util.*;
public class RotateArray {
    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for(int i = 0; i < k; i++) {
            int tempt = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, tempt);
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
