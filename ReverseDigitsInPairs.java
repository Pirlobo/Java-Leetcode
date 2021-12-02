public class ReverseDigitsInPairs {
    public static void main(String[] args) {
        
        int a = 1234;
        System.out.println(reverseDigitsInPairs(a));
    }
    public static int reverseDigitsInPairs(int n) {
        String result = "";
        String s = Integer.toString(n);
        char last = s.charAt(s.length() - 1);
        for(int i = 0; i<s.length(); i += 2) {
            if (i + 2 > s.length()) {
                result += last;
                return Integer.parseInt(result);
            }
            String sub = s.substring(i, i+2);
            String reverse = "";
            for (int j = 0; j < sub.length(); j++){
                reverse =  sub.charAt(j) + reverse;
            }
            result += reverse;
        }
       int ans = Integer.parseInt(result);
       return ans;
    }
     
}
