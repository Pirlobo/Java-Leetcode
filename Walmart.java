import java.util.*;
public class Walmart {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2};
        System.out.println(totalFruit(arr));
    }
    public static int totalFruit(int[] tree) {
        Set<Integer> set = new HashSet<Integer>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < tree.length; i++) {
            int current = tree[i];
            if (set.size() < 2 || set.contains(current)) {
                set.add(current);
                max = Math.max(max, i - start + 1);
            }else{
                int l = tree[i-1];
                for (int j = i - 1; j >= 0; j--) {
                    if (l != tree[j]) {
                        start = j + 1;
                        set.remove(tree[j]);
                        set.add(tree[i]);
                        break;
                    }
                }
            }
        }
        return max;
    }
}
