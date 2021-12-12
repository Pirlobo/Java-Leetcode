import java.util.*;
public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        countPrimes(n);
    }
    public static int countPrimes(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 2 ; i < n; i++){
            if(isPrimeNumber(i)){
                list.add(i);
            }
        }
        return list.size();
    }
    public static boolean isPrimeNumber(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0) return false;
            else{
                continue;
            }
        }
        return isPrime;
    }
}
