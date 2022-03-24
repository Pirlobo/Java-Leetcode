public class LongestSubArrayByTarget{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,0,0,6,7,8,9};
        findLongestSubArrayByTarget(array, 15);
    }
    public static int[] findLongestSubArrayByTarget(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0 ;
        int right = 0;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (left < right && sum > target) {
                sum -= nums[left++];
            }
            if (sum == target && (result[1] - result[0]) < (right - left)) {
                result[0] = left;
                result[1] = right;
            }
            right++;
        }
        return result;
    } 
}