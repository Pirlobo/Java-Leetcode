public class LongerContiguousSegmentsOfOnesThanZeros{
    public static void main(String[] args) {
        String binary = "110100010";
        System.out.println(checkZeroOnes(binary));
    }
    public static boolean checkZeroOnes(String s) {
        int longestConsecutiveZeros = getLongestConsecutiveZerosInBinaryString(s, '1');
        int longestConsecutiveOnes = getLongestConsecutiveZerosInBinaryString(s, '0');
        return longestConsecutiveOnes > longestConsecutiveZeros;
    }
    public static int getLongestConsecutiveZerosInBinaryString(String binary, char key) {
        int result = 0;
        int currentSum = 0;
        for(int i = 0 ; i < binary.length() ; i++) {
            int current = binary.charAt(i);
            if (current == key) {
                result = Math.max(result, currentSum);
                currentSum = 0;
            } else {
                currentSum++;
            }
        }
        result = Math.max(result, currentSum);
        return result;
    }
}