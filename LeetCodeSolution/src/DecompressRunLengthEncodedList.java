import java.util.*;

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        while(i<nums.length) {
            while(nums[i]>0) {
                res.add(nums[i+1]);
                nums[i]--;
            }
            i=i+2;
        }
        return res.stream().mapToInt(value -> value).toArray();
    }
}