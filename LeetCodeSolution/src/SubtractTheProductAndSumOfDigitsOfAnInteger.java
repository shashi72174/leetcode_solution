public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int prod=1;
        int sum=0;
        for(int i=0;i<s.length();i++) {
            prod=prod*Integer.parseInt(""+s.charAt(i));
            sum=sum+Integer.parseInt(""+s.charAt(i));
        }
        return prod-sum;
    }
}
