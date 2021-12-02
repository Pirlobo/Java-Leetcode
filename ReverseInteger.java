public class ReverseInteger {
    public static void main(String[] args) {
        int a = 1534236469;
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
        int reversed = 0;
        while(x != 0) {
          int digit = x % 10;
          reversed = reversed * 10 + digit;
          x /= 10;
        }
        return reversed;
    }
}
