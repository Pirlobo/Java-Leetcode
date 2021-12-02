import java.util.*;
public class FirstNoneRepeatingChar {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s){
        int index = -1;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> set : map.entrySet()) {
            int value = set.getValue();
            if(value == 1) {
                return s.indexOf(Character.toString(set.getKey()));
            }
        }
        return index;
    }
}
