import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumProductTwoElementsArray {
    public static void main(String[] args) {
        int[] nums = new int[] {3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = 1;
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(maxProduct<(nums[i]-1)*(nums[j]-1))
                    maxProduct=(nums[i]-1)*(nums[j]-1);
            }
        }
        return maxProduct;
    }
}