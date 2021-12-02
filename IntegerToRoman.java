public class IntegerToRoman {
    public static void main(String[] args) {
        String roman = intToRoman(39);
        System.out.println(roman);
    }
    public static String intToRoman(int num) {
        String romans[] = {"I", "IV", "V", "IX", "X", 
        "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int value[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int index = romans.length - 1;
        String ans = "";
        while (num > 0) {
            while(num >= value[index]){
                ans += romans[index];
                num -= value[index];
            }
        index--;
        }
        return ans;
    }
}