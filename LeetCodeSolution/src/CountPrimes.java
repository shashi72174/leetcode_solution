public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int n=499979;
        System.out.println(countPrimes(n));
        System.out.println(System.currentTimeMillis());
    }
    /*public static int countPrimes(int n) {
        if(n<=2)
            return 0;
        else if(n==3)
            return 1;
        int count=1;
        boolean flag = true;
        for(int i=3;i<n;i=i+2) {
            flag = true;
            for(int j=2;j<=i/2;j=j+2) {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }*/


    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true; // 2 is the only even prime
        if (n % 2 == 0) return false;
        for (int j = 3; j <= Math.sqrt(n); j += 2) //loop over all odd numbers
            if (n % j == 0)
                return false;
        return true;
    }
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (isPrime(i)) count++;
        return count;
    }
}