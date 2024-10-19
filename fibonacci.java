public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;
        int evenSum = 0, oddSum = 0, totalSum = 0;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            
            totalSum += t1;
            
            if (t1 % 2 == 0) {
                evenSum += t1;
            } else {
                oddSum += t1;
            }
            
            // Calculate the next term
            int nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        
        System.out.println("\nSum of even terms: " + evenSum);
        System.out.println("Sum of odd terms: " + oddSum);
        System.out.println("Sum of all terms: " + totalSum);
    }
}