import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++) {
            res[j++]=nums[i];
            res[j++]=nums[i+n];
        }
        return res;
    }
}