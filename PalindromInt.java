public class PalindromInt {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
//     public static boolean isPalindrome(int x) {
//         String a = String.valueOf(x);
//         String reverse = "";
//         for (int i = 0; i < a.length(); i++) {
//             reverse = a.charAt(i) + reverse;
//     }
//         if(a.equals(reverse)) {
//             return true;
//         }
//         return false;
// }
public static boolean isPalindrome(String s) {
    s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    String reverse = "";
    for (int i = 0 ; i < s.length(); i++){
        reverse = s.charAt(i) + reverse;
    }
    if (s.equals(reverse)){
        return true;
    }
    return false;
}
}
