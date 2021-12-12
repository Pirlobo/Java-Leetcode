import static java.lang.Math.sqrt;
public class ReverseInteger {
    public static void main(String[] args) {
        int a = 1534236469;
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
        System.out.println(964632435 * 10);
        int reversed = 0;
        while(x != 0) {
          int digit = x % 10;
          reversed = (reversed * 10) + digit;
          x /= 10;
        }
        return reversed;
    }
}
