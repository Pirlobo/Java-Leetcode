import java.util.*;
public class LargestNumber {
  public static void main(String[] args) {
      int[] numbers = {3,30,34};
      // 330 vs 303 => 3 30 
      // 3034 vs 3430 => 34 30
      // 334 vs 343 => 34 3 30
      System.out.println(largestNumber(numbers));
  }  
  public static String largestNumber(int[] nums) {
    int size = nums.length;  
    String[] s = new String[size];
    for (int i = 0; i < size; i++) {
        s[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
    StringBuilder builder = new StringBuilder();
    for (String string : s) {
        builder.append(string);
    }
    String result = builder.toString();
    return result.startsWith("0") ? "0" : result;
  }
}
