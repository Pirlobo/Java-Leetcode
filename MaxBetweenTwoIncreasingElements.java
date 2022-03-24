public class MaxBetweenTwoIncreasingElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1,5,2,10};
        System.out.println(maximumDifference(arr));
    }
    public static int maximumDifference(int[] nums) {
        int ans = -1;
        if(nums.length < 2) return ans;
        int max = nums[1] - nums[0];
        int min = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            max = Math.max(max, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        if(max <= 0) return -1;
        return max;
    }
}
