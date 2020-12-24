public class NumberStepsReduceNumberToZero {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps (int num) {
        int count =0;
        if(num==0)
            return 0;
        while(num!=0) {
            if(num%2==0)
                num=num/2;
            else
                num=num-1;
            count++;
        }
        return count;
    }
}