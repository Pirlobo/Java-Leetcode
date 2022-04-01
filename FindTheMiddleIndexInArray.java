public class FindTheMiddleIndexInArray{
    public static void main(String[] args) {
        int[] nums = {2,5,-5};
        System.out.println(findMiddleIndex(nums));
    }
    public static int findMiddleIndex(int[] nums) {
        int res = -1;
        int sum = 0;
        int size = nums.length;
        for(int i = 0 ; i < size; i++){
            sum += nums[i];
        }
        
        int left = 0;
        if(left == (sum - nums[0])) return 0;
        for(int i = 0 ; i < size - 1; i++){
            
            left += nums[i];
            int right = sum - nums[i+1] - left;
            if (left == right) return i+1;
        }
        
        return res;
    }
}