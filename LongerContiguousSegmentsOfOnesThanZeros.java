public class LongerContiguousSegmentsOfOnesThanZeros{
    public static void main(String[] args) {
        String binary = "110100010";
        System.out.println(checkZeroOnes(binary));
    }
    public static boolean checkZeroOnes(String s) {
        int longestConsecutiveOnes = getLongestConsecutiveZerosInBinaryString(s, '1');
        int longestConsecutiveZeroes = getLongestConsecutiveZerosInBinaryString(s, '0');
        return longestConsecutiveOnes > longestConsecutiveZeroes;
    }
    public static int getLongestConsecutiveZerosInBinaryString(String binary, char key) {
        int result = 0;
        int currentSum = 0;
        for(int i = 0 ; i < binary.length() ; i++) {
            int current = binary.charAt(i);
            if (current == key) {
                currentSum++;
            } else {
                result = Math.max(result, currentSum);
                currentSum = 0;
            }
        }
        result = Math.max(result, currentSum);
        return result;
    }
}