public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int rob1 = 0,rob2 = 0;
        if (nums.length == 0) return 0;
        
        for(int i = 0 ; i < nums.length; i++) {
           int current = nums[i];
           int tempt = Math.max(current + rob1, rob2);
           rob1 = rob2;
           rob2 = tempt; 
        }  
        return rob2;
    }
}
