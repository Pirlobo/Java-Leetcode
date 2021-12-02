import java.util.*;


// Time Complexity : O(n^3) => n is the number of cuts, the three for loops causes O(n^3) to
// Space Complexity : O(n^2) => because of memoization 
public class LumberCuttingProblem {
    public static void main(String[] args) {
        int n = 42;
        System.out.println("The length of lumber: " + n);
        int cuts[] = { 18 , 25, 32, 6 };
        System.out.print("Cut positions: ");
        for (int i = 0; i < cuts.length; i++)
            System.out.print(cuts[i] + ", ");
        System.out.println("\nMinimum Most: " + findMinCost(n, cuts));
    }

    // find minimum cost
    public static int findMinCost(int n, int[] cuts) {
        List<Integer> list = new ArrayList<Integer>();
        for (int pos : cuts) {
            list.add(pos);
        }
        list.addAll(Arrays.asList(0, n));
        Collections.sort(list);
        // create table
        int[][] table = new int[list.size()][list.size()];
        for (int i = list.size() - 1; i >= 0; --i) {
            for (int j = i + 1; j < list.size(); ++j) {
                for (int k = i + 1; k < j; ++k) {
                    int a = table[i][j] == 0 ? Integer.MAX_VALUE : table[i][j];
                    int b = list.get(j) - list.get(i) + table[i][k] + table[k][j];
                    table[i][j] = Math.min(a,b);
                }
            }
        }
        return table[0][list.size() - 1];
    }
}