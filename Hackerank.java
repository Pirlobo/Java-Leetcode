import java.util.*;
public class Hackerank {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<Integer>();
        sourceList.add(1);
        sourceList.add(13);
        sourceList.add(3);
        sourceList.add(8);
        sourceList.add(14);
        sourceList.add(9);
        sourceList.add(4);
        sourceList.add(4);

        int[] height = {1,8,6,2,5,4,8,3,7};
        List<Integer> result = cutTheSticks(sourceList);
        for (Integer integer : result) {
            System.out.println(integer);
        }
        // System.out.println(appendAndDelete(s, t, k));
    }

    // public static String appendAndDelete(String s, String t, int k) {
    //     // Write your code here
    //         int count = 0;
    //         for (int i = 0; i < s.length(); i++) {
    //             char currentOfS = getChar(s, i);
    //             char currentOfT = getChar(t, i);
                
    //             if (currentOfS == currentOfT) continue;
    //             else {
    //                count = (s.length() - i) + (t.length() - i);
    //                break;
    //             }
    //         }
    //         if (k >= count) return "Yes";
    //         else return "No";
    //     }

    // public static char getChar(String s, int index) {
    //     try {
    //         char c = s.charAt(index);
    //         return c;
    //     } catch (Exception e) {
    //         return '\0';
    //     }
    // }
    // public static int equalizeArray(List<Integer> arr) {
    //     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    //     int max = 0;
    //     for (int i = 0; i < arr.size(); i++) {
    //         map.put(arr.get(i), map  .getOrDefault(arr.get(i), 0) + 1);
    //         max = Math.max(max, map.getOrDefault(arr.get(i), 0));
    //     }
    //     int count = 0;
    //     for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
    //         if (entry.getValue() == max) {
    //             count = arr.size() - max;
    //         }
    //     }
    //     return count;

    // }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
            Set<Integer> output = new LinkedHashSet<Integer>();
            int minStick = 1;
            for(int i = 0 ; i < arr.size(); i++) {
                minStick = Math.min(minStick, arr.get(i));
            }
            while (arr.size() > 0) {
                int count = 0;
                for(int i = 0 ; i < arr.size(); i++) {
                    int currentStick = arr.get(i);
                    if(minStick == currentStick) {
                        arr.remove(i);
                        i = i - 1;
                        count++;
                    }
                    else {
                        arr.set(i, arr.get(i) - minStick);
                        count++;
                    }
            }
                output.add(count);
            }
            return new ArrayList<>(output);
        }

}