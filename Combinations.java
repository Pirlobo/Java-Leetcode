import java.util.*;

public class Combinations {
   
    public void backTrack(int start, LinkedList<Integer> current, int n, 
        int k, List<List<Integer>> ans) {
        if (current.size() == k) {
            ans.add(new LinkedList<Integer>(current));
        }
        for (int i = start; i <= n && current.size() < k ; i++) {
            current.add(i);
            backTrack(i+1, current, n, k, ans);
            current.removeLast();
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new LinkedList<List<Integer>>(); 

        if (k == 0) {
            list.add(new LinkedList());
            return list;
        }
        backTrack(1, new LinkedList<Integer>(), n, k, list);
        return list;
   }

}
