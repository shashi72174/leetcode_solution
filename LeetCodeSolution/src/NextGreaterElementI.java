import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            res[i]=findMax(list.subList(list.indexOf(nums1[i])+1,list.size()),nums1[i]);
        }
        return res;
    }

    private static int findMax(List<Integer> list,int num) {
        int nextGreat=-1;
        for(int i=0;i<list.size();i++) {
            if(list.get(i)>num) {
                nextGreat = list.get(i);
                break;
            }
        }
        return nextGreat;
    }
}