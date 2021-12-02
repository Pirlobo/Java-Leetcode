public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "hackerrekcahba";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String ans = "";
        int size = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (substring.length() > size) {
                    String reverse = "";
                    for (int k = 0; k < substring.length(); k++) {
                        reverse = substring.charAt(k) + reverse;
                    }
                    if (substring.equals(reverse) && substring.length() > size) {
                        size = substring.length();
                        ans = substring;
                    }   
                }
                continue;
            }
        }   
        if (ans.equals("")) {
            return String.valueOf(s.charAt(0));
        }
        System.out.println(ans);
        return ans;
    }
}
