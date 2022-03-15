public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "101110";
        // System.out.println(binaryToDecimal(binary));
        System.out.println(bitExtracted(Integer.parseInt(binary, 2), 3, 0));
    }
    public static int bitExtracted(int number, int k, int p)
    {
        // 0111
        //01110
        //00110
        // left shift
        // 0111
        int a = ((1 << k) - 1);
        // right shift
        int b = (number >> (0));
        return (a & b);
    }
    public static int binaryToDecimal(String binary){
        int size = binary.length() - 1;
        int decimal = 0;
        int count = 0;
        while (size>=0) {
            char current = binary.charAt(size);
            if (current == '1') {
                decimal += Math.pow(2, count);
                count++;
            }else{
                count++;
                size--;
                continue;
            }
            size--;
        }
        return decimal;
    }
}
