public class CountOddNumberInterval {
    public static void main(String[] args) {
        System.out.println(countOddNums(8, 10));
    }

    public static int countOddNums(int low, int high){
        if(low % 2 == 0) low = low+1;
        if(high % 2 == 0) high = high-1;

        // if(low == high) return 1;
        int res = (high - low + 1) - (high-low)/2;

        return res;

    }
}
