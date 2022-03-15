import java.util.*;
public class WordBreak {
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<String>();
        // wordDict.add("car");
        wordDict.add("apple");
        wordDict.add("pen");
        
        System.out.println(wordBreak(s, wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] isWordBreak = new boolean[s.length() + 1];
        isWordBreak[0] = true;
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j,i);
                if (isWordBreak[j] && wordDict.contains(sub)) {
                    isWordBreak[i] = true;
                    break;
                }
            }
        }
        return isWordBreak[s.length()];
    }
}
