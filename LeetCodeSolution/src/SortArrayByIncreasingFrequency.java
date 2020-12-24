import java.util.*;
import java.util.stream.Stream;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        Stream<Map.Entry<Integer, Integer>> resultMap = map.entrySet().stream().sorted((new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()<o2.getValue())
                    return -1;
                else if(o2.getValue()<o1.getValue())
                    return 1;
                else if(o1.getValue()==o2.getValue()){
                    if(o1.getKey()>o2.getKey())
                        return -1;
                    else
                        return 1;
                }
                return 0;
            }
        }));
        Iterator<Map.Entry<Integer, Integer>> iterator = resultMap.iterator();
        int i=0;
        while(iterator.hasNext()) {
            Map.Entry<Integer,Integer> newEntry = iterator.next();
            for(int j=0;j<newEntry.getValue();j++) {
                res[i]=newEntry.getKey();
                i++;
            }
        }
        return res;
    }
}
