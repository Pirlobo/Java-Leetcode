import java.util.*;
public class GroupAnagrams {
   public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
       List<List<String>> str = getGroupAnagrams(strs);
       for (List<String> list : str) {
           System.out.println(list);
       }
   } 
   public static List<List<String>> getGroupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<List<String>>();
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            if (!map.containsKey(new String(c))) {
                map.put(new String(c), String.valueOf(i));
            } else {
                map.put(new String(c), map.get(new String(c)) + " " + String.valueOf(i));
            }
        }
        for(Map.Entry<String, String> entry : map.entrySet()) {
            List<String> group = new ArrayList<>();
            String[] current = entry.getValue().split(" ");
            for (int i = 0; i < current.length; i++) {
                String s = strs[Integer.parseInt(current[i])];
                group.add(s);
            }  
            groups.add(group); 
        }

        
        return groups;
   }
}
