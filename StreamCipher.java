// With Duc Tan Hoang, Dung Vuong

// References 
//https://github.com/pamelasabio/A5-1-Encryption-Algorithm
//https://en.wikipedia.org/wiki/A5/1

import java.util.*;

public class StreamCipher {
    static String xStr;
    static String yStr;
    static String zStr;
    public static void shiftRight(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static String convertArrayToString(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += String.valueOf(arr[i]);
        }
        return res;
    }

    public static void A51(int[] x, int[] y, int[] z) {
        String keyStream = "";

        System.out.println("After Initialization: ");
        System.out.println("X: " + xStr);
        System.out.println("Y: " + yStr);
        System.out.println("Z: " + zStr);

        for (int i = 0; i < 32; i++) {
            int majorKey = ((x[8] & y[10]) ^ (x[8] & z[10]) ^ (y[10] & z[10]));
            if (x[8] == majorKey) {
                int t = (x[13] ^ x[16] ^ x[17] ^ x[18]);
                shiftRight(x);
                x[0] = t;
            }

            if (y[10] == majorKey) {
                int t = (y[20] ^ y[21]);
                shiftRight(y);
                y[0] = t;
            }

            if (z[10] == majorKey) {
                int t = (z[7] ^ z[20] ^ z[21] ^ z[22]);
                shiftRight(z);
                z[0] = t;
            }
            keyStream = "" + (x[18] ^ y[21] ^ z[22]) + keyStream;
        }
        System.out.println("\n32bit Keystream : " + keyStream);

        System.out.println("\nAfter 32 keystream bits generated: ");

        String xGenerated = convertArrayToString(x);
        String yGenerated = convertArrayToString(y);
        String zGenerated = convertArrayToString(z);
        System.out.println("X: " + xGenerated);
        System.out.println("Y: " + yGenerated);
        System.out.println("Z: " + zGenerated);
    }

    public static int[] getUserInput(String input) {
        int[] register = new int[input.length()];
        for (int i = 0; i < register.length; i++) {
            register[i] = Character.getNumericValue(input.charAt(i));
        }
        return register;

    }

    // Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X register ");
        xStr = scanner.nextLine();
        int[] x = getUserInput(xStr);
        System.out.println("Enter Y register ");
        yStr = scanner.nextLine();
        int[] y = getUserInput(yStr);
        System.out.println("Enter Z register ");
        zStr = scanner.nextLine();
        int[] z = getUserInput(zStr);

        A51(x, y, z);
    }

}