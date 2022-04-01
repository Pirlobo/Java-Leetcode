import java.util.*;
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        // As the end, the result should be [-1, 3, -1]
        System.out.println(nextGreaterElement(nums1, nums2));
        
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0 ; i < nums2.length ; i++) {
            
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            
            stack.push(nums2[i]);
        }
        
        for(int i = 0 ; i < nums1.length ; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);    
        }
        
        return nums1;
    }
}
