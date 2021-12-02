public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,3,9};
        int[] resukt = plusOne(digits);
        for (int i : resukt) {
            System.out.println(i);
        }
    }
    public static int[] plusOne(int[] digits) {
        boolean checking = checking(digits);
        int[] result = new int[digits.length  + 1];
        if (checking) {
            result[0] = 1;
            return result;
        }
        int size = digits.length - 1;
        int carry = 0;
        boolean switcher = false;
        for(int i = size; i >= 0; i--) {
            if(digits[i] != 9 && carry == 0 && i == size){
                digits[i]++;
                return digits;
            }
            else if (digits[i] != 9 && carry == 1) {
                digits[i]++;
                carry = 0;
                switcher = true;
            } else if (digits[i] == 9 && carry == 0 && switcher == false || (carry == 1 && digits[i] == 9)) {
                digits[i] = 0;
                carry = 1;
            } else if (digits[i] == 9 && carry == 0 && switcher == true) {
                continue;
            } 
        }
        return digits;
     }
     public static boolean checking(int[] digits) {
            for (int i = 0; i < digits.length; i++) {
                if(digits[i] < 9) return false;
            }
            return true;
     }
 }