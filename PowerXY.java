import java.util.Iterator;
import java.util.Stack;

public class PowerXY {
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }

    public static double pow(double x, int n) {
        if (n < 0) {
            n = -n;
        }
        if (n == 0) {
            return 1;
        }
        return (x * pow(x, n - 1));
    }

    public static double myPow(double x, int n) {
        try {
            double result = pow(x, n);
            if (n < 0) {
                return 1 / result;
            }
            return result;
        } catch (Exception e) {
            return 0;
        } 
    }
}