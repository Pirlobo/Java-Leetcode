import java.util.*;
public class WordLadder {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("hot");
        words.add("dot");
        words.add("dog");
        words.add("log");
        words.add("cog");
        System.out.println(ladderLength("hit", "cog", words));
    }
    public static int ladderLength(String beginWord, 
    String endWord, List<String> wordList) {
        Set<String> set = new HashSet<String>(wordList);
        for (String word : wordList) {
            set.add(word);
        }
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                char[] word_chars = queue.poll().toCharArray();
                for (int j = 0; j < word_chars.length; j++) {
                    char original = word_chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (word_chars[j] == c) {
                            continue;   
                        }
                        word_chars[j] = c;
                        String convertBack = String.valueOf(word_chars);
                        if (convertBack.equals(endWord)) {
                            return level + 1;
                        }
                        if (set.contains(convertBack)) {
                            queue.add(convertBack);
                            // go to hot, then remove hot from the set 
                            set.remove(convertBack);
                        }
                    }
                    word_chars[j] = original;
                }
            }
            level++;
        }
        return 0;
    }
}