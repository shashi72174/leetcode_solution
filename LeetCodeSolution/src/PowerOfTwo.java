public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }


    public static boolean isPowerOfTwo(int n) {
        for(int i = -31;i<31;i++) {
            int res = (int)Math.pow(2,i);
            if(res == n)
                return true;
            else if(res > n)
                return false;
        }
        return false;
    }
}
