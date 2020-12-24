import java.util.HashMap;
import java.util.Map;

public class FindDifferenceInString {
    public static void main(String[] args) {
        String s = "ae";
        String t = "aea";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        if(s.length()==0)
            return t.charAt(0);
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(map1.containsKey(s.charAt(i)))
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            else
                map1.put(s.charAt(i),1);
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++) {
            if(map2.containsKey(t.charAt(i)))
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            else
                map2.put(t.charAt(i),1);
        }
        for(Character c :  map2.keySet()) {
            if(map1.containsKey(c)) {
                if(map2.get(c)!=map1.get(c))
                    return c;
            }else
                return c;
        }
        return '\u0000';
    }
}