import java.util.*;
public class Binary_Search {
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static int search(int[] nums, int target){
       int index = binarySearch(nums, 0, nums.length - 1, target);
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(search(nums, 2));
    }
}
