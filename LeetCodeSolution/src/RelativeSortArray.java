import java.util.*;
import java.util.stream.IntStream;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19}, arr2 = new int[]{2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int resArrIdx = 0;
        int j=0;
        for(int i=0;i<arr2.length;i++) {
            while(j<arr1.length) {
                if(arr2[i]==arr1[j]) {
                    res[resArrIdx]=arr1[j];
                    resArrIdx++;
                }
                j++;
            }
            j=0;
        }
        List<Integer> list = missingElements(arr1,arr2);
        for(Integer i : list) {
            res[resArrIdx]=i;
            resArrIdx++;
        }
        return res;
    }
    private static List<Integer> missingElements(int[] arr1,int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {
            final int temp = i;
            if(!IntStream.of(arr2).anyMatch(value -> value==arr1[temp]))
                list.add(arr1[i]);
        }
        Collections.sort(list);
        return list;
    }
}