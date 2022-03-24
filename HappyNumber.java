import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyNum(19));
    }
    public static int getSum(int n){
        int sum = 0;
        while (n > 0) {
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return sum;
    }
    public static boolean isHappyNum(int num) {
        Set<Integer> set = new HashSet<Integer>();
        while (true) {
            int sum = getSum(num);
            if (sum == 1) {
                return true;
            }else{
                if (!set.contains(sum)) {
                    set.add(sum);
                }else{
                    return false;
                }
            }
            num = sum;
        }
    }
}
