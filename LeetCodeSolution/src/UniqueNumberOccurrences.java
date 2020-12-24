import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueNumberOccurrences {
    public static void main(String[] args) {
        int[] arr = new int[] {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        List<Integer> values = map.values().stream().sorted().collect(Collectors.toList());
        int visited = 0;
        for(Integer val : values) {
            if(visited!=val)
                visited=val;
            else
                return false;
        }
        return true;
    }
}
