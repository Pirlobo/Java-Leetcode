import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int max = 0 ;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
