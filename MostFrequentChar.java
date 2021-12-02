import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args) {
        String s = "abcabccaaaa";
        System.out.println(getMostFrequentChar(s));
    }
    public static char getMostFrequentChar(String s) {
        if (s.length() == 0) {
            return '\0';
        }
        char output = s.charAt(0);
        int max = 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                if (map.get(c) > max) {
                    max = map.get(c);
                    output = c;
                }
            } else {
                map.put(c, 1);
            }
        }
        return output;
    }
}
