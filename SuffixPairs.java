import java.util.*;
public class SuffixPairs {
    public static void main(String[] args) {
        String[] input = {"back", "backdoor", "gammback", "backgammon", "comeback", "come", "door"};
        System.out.println(suffixPairs(input));
    }
    public static int suffixPairs(String[] input) {
        int result = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                String a = input[i];
                String b = input[j];
                if (b.length() >= a.length()) {
                    if(b.indexOf(a) != -1 && b.substring(b.indexOf(a), b.length()).equals(a)) {
                        result++;
                    }
                }else{
                    if(a.indexOf(b) != -1 && a.substring(a.indexOf(b), a.length()).equals(b)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
