import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {
        int[] target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        List<Integer> list = Arrays.stream(target).boxed().collect(Collectors.toList());
        for(int i=0;i<arr.length;i++) {
            if(!list.contains(arr[i]))
                return false;
            else
                list.remove(new Integer(arr[i]));
        }
        return true;
    }
}