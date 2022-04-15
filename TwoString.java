import java.util.Arrays;

public class TwoString {
    public static void main(String[] args) {
        String str1 = "god";
        String str2 = "dog";
    }
    public static boolean checkIfPermunation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        else{
            char[] str1CharArr = str1.toCharArray();
            // d, 
            char[] str2CharArr = str2.toCharArray();

            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);

            for (int i = 0; i < str1CharArr.length; i++) {
                if (str1CharArr[i] == str2CharArr[i]) {
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }
    }
}
