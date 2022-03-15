import java.util.*;

public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        int[] ans = shortestToChar("loveleetcode", 'e');
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] shortestToChar(String s, char c) {
        int size = s.length();
        int[] result = new int[size];
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            char current = s.charAt(i);
            if (current == c)
                indices.add(i);
        }
        for (int i = 0; i < size; i++) {
            int min = Integer.MAX_VALUE;
            for (int idx : indices) {
                min = Math.min(min, Math.abs(i - idx));
            }
            result[i] = min;
        }
        return result;
    }
}
