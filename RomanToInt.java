public class RomanToInt {
    public static void main(String[] args) {
        String roman = "XXXIX";
        int value = romanToInt(roman);
        System.out.println(value);
    }
    public static int romanToInt(String s) {
        int result = charToRomanNumValue(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            int a = charToRomanNumValue(s.charAt(i));
            int b = charToRomanNumValue(s.charAt(i+1));
            if (b > a) {
                result += (b - 2*a);
            }
            else {
                result += b;
            }
        }
        return result;
    }
    public static int charToRomanNumValue(char c) {
        switch (c) {
            case 'I':
                return  1; 
            case 'V':
                return  5;
            case 'X':
                return  10;    
            case 'L':
                return  50;
            case 'C':
                return  100;
            case 'D':
                return  500;    
            case 'M':
                return  1000;
            default: return 0;
        }
    }
}