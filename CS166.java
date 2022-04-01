// With Duc Tan Hoang, Dung Vuong

import java.util.Scanner;
import java.util.*;
public class CS166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        boolean flag = true;
        String source = "GBSXUCGSZQGKGSQPKQKGLSKASPCGBGBKGUKGCEUKUZKGGBSQ EICACGKGCEUERWKLKUPKQQGCIICUAEUVSHQKGCEUPCGBCGQOE VSHUNSUGKUZCGQSNLSHEHIEEDCUOGEPKHZGBSNKCUGSUKUASE RLSKASCUGBSLKACRCACUZSSZEUSBEXHKRGSHWKLKUSQSKCHQT XKZHEUQBKZAENNSUASZFENFCUOCUEKBXGBSWKLKUSQSKNFKQQ KZEHGEGBSXUCGSZQGKGSQKUZBCQAEIISKOXSZSICVSHSZGEGB SQSAHSGKHMERQGKGSKREHNKIHSLIMGEKHSASUGKNSHCAKUNSQ QKOSPBCISGBCQHSLIMQGKGSZGBKGCGQSSNSZXQSISQQGEAEUG CUXSGBSSJCQGCUOZCLIENKGCAUSOEGCKGCEUQCGAEUGKCUSZU EGBHSKGEHBCUGERPKHEHKHNSZKGGKAD";
        Set<Character> set = new HashSet<>();
        
        do {
            System.out.println("Enter key");
            String key = scanner.nextLine();  
            if (key.equalsIgnoreCase("stop")) {
                break;
            }
            if (key.length() != 26) {
                System.out.println("Key Length must be 26");
            }else{
                for (int i = 0; i < key.length(); i++) {
                    set.add(key.charAt(i));
                }
                if (set.size() != 26) {
                    System.out.println("The key you entered has duplciated characters");
                    continue;
                }else{
                    System.out.println(decryft(source, key));
                System.out.println("Is it correct?");
                String isCorrect = scanner.nextLine();  
                if (isCorrect.equalsIgnoreCase("Yes") || isCorrect.equalsIgnoreCase("Y")) {
                    break;
                }else{
                    continue;
                }
                }
            }
                      
        } while (flag);
    }
    public static String decryft(String source, String key) {
        String answer = "";
        char[] plainText = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] cypherText = key.toCharArray();
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < plainText.length; j++) {
                if (Character.toLowerCase(source.charAt(i)) == plainText[j]) {
                    answer += cypherText[j];
                }
            }
        }
        return answer;
        // GBS => THE
        // abcdefghijklmnopqrstuvwxyz
        // CHIKOBTRLXAPYMGWSFEQNVJUZD

    }

}
