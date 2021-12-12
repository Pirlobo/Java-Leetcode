import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i] ,0) + 1);
        } 
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return 0;
        
    }
}
