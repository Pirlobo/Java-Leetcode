import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 3;
        int ans = 0;
        for (int i = 0; i < decimalToBinary(num).length(); i++) {
            if (decimalToBinary(num).charAt(i) == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static String decimalToBinary(int num) {
        int[] binaryPattern = new int[10];
        int idx = binaryPattern.length - 1;
        while (num > 0) {
            binaryPattern[idx--] = num%2;
            num = num / 2;
        }
        return Arrays.toString(binaryPattern);
    }
}
