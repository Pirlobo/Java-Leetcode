import java.util.*;
public class ExpressiveWords {
    public static void main(String[] args) {
        String[] words = new String[]{"hi", "helo"};
        System.out.println(expressiveWords("heeelloo", words));
    }
    // s = "heeellooo", words = ["hello", "hi", "helo"]
    public static int expressiveWords(String S, String[] words) {
        int count = 0;
        for (String w : words) {
            int i, j; // S & w's pointers.
            for (i = 0, j = 0; i < S.length(); ++i) {
                if (j < w.length() && S.charAt(i) == w.charAt(j)) { // matches, w pointer j 1 step forward to move together with i.
                    ++j;
                }else if (i > 0 && S.charAt(i - 1) == S.charAt(i) && i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) { // previous, current & next are same.
                    ++i; // S pointer 1 step forward, attempt to traverse the repeated chars.
                 }else if (!(i > 1 && S.charAt(i) == S.charAt(i - 1) && S.charAt(i) == S.charAt(i - 2))) { // current & previous 2 are not same. 
                    break; // No match.
                }
            }
            if (i == S.length() && j == w.length()) { ++count; } // both pointers reach ends.
        }
        return count;
    }
    public static List<String> getCharGroup(String s) {
        List<String> words = new ArrayList<String>();
        int start;
        boolean flag = false;
        for (int i = 0; i < s.length() - 1; i++) {
            start = i;
            
            while (s.charAt(i) == s.charAt(i + 1)) {
                i++;
                if ((i+1) >= s.length()) {
                    words.add(s.substring(start,i+1));
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            words.add(s.substring(start,i+1));
            
        }
        if (s.charAt(s.length() - 1) != words.get(words.size() - 1).charAt(0)) {
            words.add(String.valueOf(s.charAt(s.length() - 1)));
        }
        return words;
    }
}
