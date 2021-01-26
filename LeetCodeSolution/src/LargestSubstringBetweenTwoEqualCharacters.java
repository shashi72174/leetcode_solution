import java.util.HashMap;
import java.util.Map;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int largest = -1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),i+1);
            else {
                if(largest<i-map.get(s.charAt(i)))
                    largest = i-map.get(s.charAt(i))==1 ? 0 : i-map.get(s.charAt(i));
            }
        }
        return largest;
    }
}