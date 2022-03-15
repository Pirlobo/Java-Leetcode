import java.util.*;
public class LastStoneWeights {
    public static void main(String[] args) {
      int[] weights = {2,7,4,1,8,1};
      System.out.println(lastStoneWeights(weights));
    }
    public static int lastStoneWeights(int[] weights) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int stone : weights) {
            queue.add(-stone);
        }
        while (queue.size() > 1) {
            int stoneOne = -queue.remove();
            int stoneTwo = -queue.remove();
            if (stoneOne != stoneTwo) {
                queue.add(-(stoneOne - stoneTwo));
            }
        }
        return queue.isEmpty() ? 0 : -queue.remove();
    }
}
