import java.util.*;

public class AngryProfessor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(-3);
        list.add(4);
        list.add(2);
        System.out.println(angryProfessor(2, list));
    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int count = 0;
        for (Integer i : a) {
            if (i <= 0) {
                count++;
            }
        }
        // 2 <= 3
        if (k <= count) {
            return "NO";
        }
        return "YES";
    }
}
