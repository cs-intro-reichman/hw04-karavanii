public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double count =1;
        System.out.println("Prime numbers up to " + n + ":");
        System.out.println("2");
        System.out.println("3");
        count++;
        for(int i = 2;i<n;i++){
            if (i%3!=0 && i%2 != 0 && i%5 !=0) {
                System.out.println(i);
                count++;
            }
        }
        int percent = (int)((count/ n)*100);
        System.out.println("There are " +(int)count +" primes between 2 and "+n+" ("+(int)percent+"% are primes)");
    }
}