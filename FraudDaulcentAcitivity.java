import java.util.*;

public class FraudDaulcentAcitivity {
    // public static void main(String[] args) {
    //     List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5);
    //     int d = 5;
    //     System.out.println(activityNotifications(list, d));
    // }
    // public static int activityNotifications(List<Integer> expenditure, int d) {
    // // Write your code here
    // int count = 0;

    // for (int i = 0; i < expenditure.size() - d; i++) {
    // double median = 0 ;
    // for (int j = i; j < i + d; j ++) {
    // median += expenditure.get(j);
    // }
    // median /= d;
    // if (expenditure.get(i + d) >= median*2) {
    // count++;
    // }
    // }

    // return count;
    // }
    public static void main(String[] args) {
        int n = 8;
        String s = "mnonopoo";
        System.out.println(substrCount(n, s));
    }
    static long substrCount(int n, String s) {
        int result = n;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String current = s.substring(i, j + 1);
                boolean isSameChar = checkIfAlCharTheSame(current);
                if (isSameChar)
                    result++;
                boolean a = checkMiddle(current);
                if (a)
                    result++;

            }
        }
        return result;
    }

    public static boolean checkMiddle(String current) {
        String subString1 = current.substring(0, current.length()/2);
        String subString2 = current.substring(current.length()/2 + 1);
        if (current.length() % 2 == 1 && checkIfAlCharTheSame(subString1) && checkIfAlCharTheSame(subString2) && current.charAt(current.length()/2) != current.charAt(0) && subString1.equals(subString2)) {
            return true;
        }
        return false;
    }
    public static boolean checkIfAlCharTheSame(String current) {
        for (int k = 1; k < current.length(); k++) {
            if (current.charAt(k) != current.charAt(0))
                return false;
        }
        return true;
    }

}
