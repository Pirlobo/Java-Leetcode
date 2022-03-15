import java.util.*;
public class Aamazon {
    public static void main(String[] args) {
        List<String> pixels = new ArrayList<String>();
        pixels.add("011");
        pixels.add("101");
        pixels.add("001");
        getMaximumGreyness(pixels);
    }
    public static int getMaximumGreyness(List<String> pixels) {
        // Write your code here
        // 1 0 1 0 (2+2) - (2 + 1)
        // 0 1 0 1
        // 1 0 1 0
        // String[][] matrix = new String[pixels.size()][pixels.get(0).length()];
        int oneSInFirstRow = 0 ; 
        int oneSInFirstCol = 0 ; 
        
        int zeroInFirstRow = 0 ;
        int zeroInFirstCol = 0 ;
        String current = pixels.get(0);
            for(int j = 0 ; j < current.length(); j++){
                if(current.charAt(j) == '1'){
                    oneSInFirstRow++;
                }
                if (current.charAt(j) == '0') {
                    zeroInFirstRow++;
                }
            }
            
        for (int i = 0; i < pixels.size(); i++) {
            if (pixels.get(i).charAt(0) == '1') {
                oneSInFirstCol++;
            }
            if (pixels.get(i).charAt(0) == '0') {
                zeroInFirstCol++;
            }
        }
        return (oneSInFirstRow + oneSInFirstCol) - (zeroInFirstRow + zeroInFirstCol);
        }
}
