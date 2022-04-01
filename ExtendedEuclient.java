public class ExtendedEuclient {

    // recursive implementation
    public static int gcd(int p, int q) {
        System.out.println(p + " " + q);
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
    
        return p;
    }

    public static void main(String[] args) {
        
        int d  = gcd(40, 7);
        
        System.out.println("gcd(" + 40 + ", " + 7 + ") = " + d);
        
    }
}

