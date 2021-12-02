import java.util.*;

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int[] nums = {1,2,3,4,5};
        List<Integer> rotation = rotateLeft(2, numbers);
        for (Integer integer : rotation) {
            System.out.println(integer);
        }
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        for (int i = 0; i < d; i++) {
            int tempt = arr.get(0);
            arr.remove(0);
            arr.add(tempt);
        }
            return arr;
        }
}
