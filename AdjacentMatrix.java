import java.util.*;
public class AdjacentMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        List<String> verticies = new ArrayList<String>();
        System.out.println("Enter verticies : ");
        while (true) {
            String ver = input.nextLine();
            if (ver.equals("stop")) {
                break;
            }
            verticies.add(ver);
        }
        List<String> pairs = new ArrayList<String>();
        System.out.println("Enter pairs : ");
        while (true) {
            String pair = input.nextLine();
            if (pair.equals("stop")) {
                break;
            }
            pairs.add(pair);
        }
        
        int[][] matrix = getAdjacentMatrix(verticies, pairs);
        System.out.println("Adjacent Matrix");
        for (int i = 0; i < verticies.size(); i++) {
            if (i == 0) {
                System.out.print("  " + verticies.get(i) + " ");
            }
            else{
                System.out.print(verticies.get(i) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(verticies.get(i) + " ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Adjacent List");
        List<String> getAdjacentList = getAdjacentList(verticies, pairs, matrix);
        for (String string : getAdjacentList) {
            System.out.println(string);
        }
    }
    public static int[][] getAdjacentMatrix(List<String> verticies, List<String> pairs) {
        int[][] matrix = new int[verticies.size()][verticies.size()];
        for (int i = 0; i < pairs.size(); i++) {
            String[] splitted = pairs.get(i).split(" ");
            String edgeFrom = splitted[0];
            String edgeTo = splitted[1];
            Integer weight = Integer.parseInt(splitted[2]);
            int[] indexPair = new int[2];
            for (int j = 0; j < verticies.size(); j++) {
                if (edgeFrom.equals(verticies.get(j))) {
                    indexPair[0] = j;
                }
                if (edgeTo.equals(verticies.get(j))) {
                    indexPair[1] = j;
                }
            }
            matrix[indexPair[0]][indexPair[1]] = weight;
        }
        return matrix;
    }
    public static List<String> getAdjacentList(List<String> verticies, List<String> pairs, int[][] matrix) {
        List<String> adjacentList = new ArrayList<String>();
        for (int i = 0; i < matrix.length; i++) {
            String ans = verticies.get(i) + ": ";
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    ans += "[" + verticies.get(j) + ", " + matrix[i][j] + "], ";
                }
            }
            adjacentList.add(ans);
        }
        return adjacentList;
    }
}
