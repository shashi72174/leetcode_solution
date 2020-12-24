import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int missing=0;
        Arrays.sort(nums);
        if(nums.length==1 && nums[0]==0)
            return 1;
        else if(nums.length==1 && nums[0]==1)
        return 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==missing)
                missing=missing+1;
            else
                return missing;
        }
        return missing;
    }
}