import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[] {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        int majorityNumber = 0;
        int majorityNumberValue = 0;
        for(Integer num:map.keySet()) {
            if(map.get(num)>majorityNumberValue) {
                majorityNumber = num;
                majorityNumberValue = map.get(num);
            }
        }
        return majorityNumber;
    }
}