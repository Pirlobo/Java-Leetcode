import java.util.*;
public class WordBreak {
    public static void main(String[] args) {
        String s = "what San Francisco is SAP";
        List<String> wordDict = new ArrayList<String>();
        // wordDict.add("car");
        wordDict.add("what");
        wordDict.add("is");
        wordDict.add("San Francisco");
        wordDict.add("SAP");
        wordDict.add("Job");
        System.out.println(wordBreak(s, wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] isWordBreak = new boolean[s.length() + 1];
        isWordBreak[0] = true;
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (!isWordBreak[j]) {
                    continue;
                }
                if (wordDict.contains(s.substring(j,i))) {
                    isWordBreak[i] = true;
                    break;
                }
            }
        }
        return isWordBreak[s.length()];
    }
}
