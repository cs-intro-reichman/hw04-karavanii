public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        if (n >= 2) { 
            System.out.println(2); count++; 
        }
        if (n >= 3) {
             System.out.println(3); count++; 
            }
        for (int i = 4; i <= n; i++) {
            boolean prime = true;
            for (int d = 2; d * d <= i; d++) {
                if (i % d == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
                count++;
            }
        }
        int percent = (int)((count / (double)n) * 100);
        System.out.println("There are " + count + " primes between 2 and " + n +" (" + percent + "% are primes)");
    }
}
