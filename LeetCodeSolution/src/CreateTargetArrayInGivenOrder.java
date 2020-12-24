import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(index[i],nums[i]);
        return list.stream().mapToInt(i -> i).toArray();
    }
}