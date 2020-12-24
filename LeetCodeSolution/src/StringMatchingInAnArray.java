import java.util.*;

public class StringMatchingInAnArray {

    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words.length;j++) {
                if(j!=i){
                    if(words[i].contains(words[j]))
                       res.add(words[j]);
                }
            }
        }
        return new ArrayList<String>(res);
    }
}