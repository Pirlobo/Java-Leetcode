public class Compression {
    public static void main(String[] args) {
        String s = "aabbccc";
        System.out.println(compressString(s));
    }

    public static String compressString(String s) {
        int count = 1;
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char next = s.charAt(i + 1);
            if (first == next) {
                count++;
            } else {
                if (count > 1) {
                    result += String.valueOf(first) + String.valueOf(count);
                    count = 1; 
                } else {
                    result += String.valueOf(first);
                }
            }
        }
        if (count == 1) {
            result += String.valueOf(s.charAt(s.length() - 1));
        }else{
            result += String.valueOf(s.charAt(s.length() - count)) + String.valueOf(count);
        }
        return result;
    }
}
