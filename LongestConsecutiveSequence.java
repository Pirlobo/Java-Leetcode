import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }   
        int result = 0;
        for (Integer integer : set) {
            if(list.size() >= 1) {
                if(integer - list.get(list.size() - 1) == 1) {
                    list.add(integer);
                }
                else {
                    list.clear();
                    list.add(integer);
                };
            }else{
                list.add(integer);
            }
            result = Math.max(result, list.size());
        }
        return result;
    }
}
