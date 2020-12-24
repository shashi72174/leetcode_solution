public class ContinousSubArraySum {

    public static void main(String[] args) {
        int[] nums = new int[] {23, 2, 6, 4, 7};
        int k=0;
        System.out.println(checkSubarraySum(nums,k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        if(nums.length==0 && k==0)
            return false;
        for(int i=0;i<nums.length;i++) {
            sum=nums[i];
            for(int j=i+1;j<nums.length;j++) {
                sum=sum+nums[j];
                if(sum>0 && k==0)
                    continue;
                else if(sum==0 && k==0)
                    return true;
                else if(sum%k==0)
                    return true;
            }
        }
        return false;
    }
}