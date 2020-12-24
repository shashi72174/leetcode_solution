import java.util.*;
import java.util.stream.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3};
        System.out.println(new MajorityElementII().majorityElement(arr));
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> resultList = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        Stream<Map.Entry<Integer, Integer>> resultMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Iterator<Map.Entry<Integer, Integer>>  iterator = resultMap.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,Integer> newEntry = iterator.next();
            if(newEntry.getValue()>(int)Math.ceil(nums.length / 3))
                resultList.add(newEntry.getKey());
        }
        return resultList;
    }
}