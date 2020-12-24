import java.util.HashMap;

public class N_RepeatedElementInSize2NArray {

    public static void main(String[] args) {
        //int[] arr = {1,2,3,3};
        //int[] arr = {2,1,2,5,3,2};
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(arr));
    }

    public static int repeatedNTimes(int[] A) {
        int n=A.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            if(map.containsKey(A[i]))
                map.put(A[i],map.get(A[i])+1);
            else
                map.put(A[i],1);
        }
        for(Integer i : map.keySet()) {
            if(map.get(i)==n)
                return i;
        }
        return 0;
    }
}