import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        // List<String> list = topKFrequent(words, 2);
        // for (String string : list) {
        //     System.out.println(string);
        // }
        int a = 2;
        // 10
        System.out.println(a<<1);
    }
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            int count = map.getOrDefault(current, 0);
            map.put(current, count+1);
        }
        for (int i = 0; i < k; i++) {
            int max = -Integer.MAX_VALUE;
            String key = "";
            for (Map.Entry<String, Integer> set : map.entrySet()) {
                if (set.getValue() > max) {
                    max = set.getValue();
                    key = set.getKey();
                }
            }
            list.add(key);
            map.remove(key);
        }
        return list;
    }
}