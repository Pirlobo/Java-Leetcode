import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        combinationSum(candidates, 7);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0) return null;
        
        List<List<Integer>> result = new ArrayList<>();
    
        backTracking(candidates, target, 0, new ArrayList<>(), result);
        
        return result;
    }
    public static void backTracking(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result){
        if(target == 0 ){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index ; i < candidates.length; i++){
            if(target >= candidates[i]){
                current.add(candidates[i]);
                backTracking(candidates, target - candidates[i], i, current, result);
                current.remove(new Integer(candidates[i]));
            }
        }
        
    }
}
