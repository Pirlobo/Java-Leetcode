import java.util.*;
public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {
            {1,3},{2,6},{8,10},{15,18}
        };
        int[][] answ = mergeIntervals(intervals);
    }
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> result = new ArrayList<>();
        int[] current_interval = intervals[0];
        result.add(current_interval);
        for (int[] current : intervals) {
            int end = current_interval[1];
            int nextBegin = current[0];
            int nextEnd = current[1];
            if (end >= nextBegin) {
                current_interval[1] = Math.max(end, nextEnd);
            }
            else {
                current_interval = current;
                result.add(current_interval);
            }
        }
        int[][] answer = result.toArray(new int[result.size()][]);
        return answer;
    }    
}
