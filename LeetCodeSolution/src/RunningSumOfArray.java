import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[] {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        if(nums.length==0)
            return res;
        for(int i=0;i<nums.length;i++) {
            int sum=0;
            for(int j=0;j<=i;j++) {
                sum = sum+nums[j];
            }
            res[i]=sum;
        }
        return res;
    }
}
