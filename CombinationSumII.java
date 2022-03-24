import java.util.*;
public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {2,5,2,1,2};
        List<List<Integer>> list = combinationSum2(candidates, 5);
        System.out.println(list);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, candidates, new ArrayList<>(), result, 0, target);
        Set<List<Integer>> ans = new HashSet<>();
        for (List<Integer> list : result) {
            Collections.sort(list);
        }
        for (List<Integer> list : result) {
            ans.add(list);
        }
        result.clear();
        result = new ArrayList<>(ans);
        return result; 
        }
    public static void backTrack(int start, int[] numbers, 
    ArrayList<Integer> current, List<List<Integer>> subset, int currentSum, int target) {
        if (currentSum == target) {
            subset.add(new ArrayList<Integer>(current));
        }
        for (int i = start ; i < numbers.length; i++) {
            current.add(numbers[i]);
            currentSum += numbers[i];
            backTrack(i+1, numbers, current, subset, currentSum, target);
            currentSum -= current.get(current.size() - 1);
            current.remove(current.size() - 1);
        }

    }
}
