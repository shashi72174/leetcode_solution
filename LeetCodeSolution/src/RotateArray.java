import java.util.ArrayList;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-100,3,99};
        int k = 2;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];
        int start = nums.length-k;
        int newArrIdx = 0;
        for(int i=start;i<nums.length;i++) {
            newArr[newArrIdx] = nums[i];
            newArrIdx++;
        }
        for(int i=0;i<start;i++) {
            newArr[newArrIdx] = nums[i];
            newArrIdx++;
        }
        nums=newArr;
    }
}
