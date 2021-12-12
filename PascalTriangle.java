import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        generate(numRows);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        list.add(a);
        if(numRows == 1) return list;
        List<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(1);
        list.add(b);
        for(int i = 3 ; i <= numRows; i++){
            List<Integer> lastList = list.get(list.size() - 1);
            List<Integer> addedList = new ArrayList<Integer>();
            addedList.add(1);
            for(int j = 0 ; j < lastList.size() - 1; j++){
                addedList.add(lastList.get(j) + lastList.get(j+1));
            }
            addedList.add(1);
            list.add(addedList);
        }
        return list;
    }
}
