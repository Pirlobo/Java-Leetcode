import java.util.*;

public class FindFirstAndLstPostition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        searchRange(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int mid = binarySearch(nums, 0, nums.length - 1, target);
        int left = mid, right = mid;
        for(int i = mid + 1; i < nums.length; i++) {
            if(nums[i] == target) {
                right++;
            } else{
                break;
            }
        }
        for(int i = mid - 1; i >= 0; i--) {
            if(nums[i] == target) {
                left--;
            }else{
                break;
            }
        }
        int[] result = new int[]{left,right};
        return result;
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
