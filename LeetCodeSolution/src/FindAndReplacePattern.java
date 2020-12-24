import java.util.*;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abb","deq","mee","aqq","dkd","ccc","ncc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words,pattern));
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character,Character> map1 = null;
        Map<Character,Character> map2 = null;
        List<String> res = new ArrayList<>();
        outerLoop: for(int i=0;i<words.length;i++) {
            map1 = new HashMap<>();
            map2 = new HashMap<>();
            boolean flag = true;
            innerLoop: for(int j=0;j<words[i].length();j++) {
                if(!map1.containsKey(words[i].charAt(j))){
                    if(!map2.containsKey(pattern.charAt(j))) {
                        map1.put(words[i].charAt(j), pattern.charAt(j));
                        map2.put(pattern.charAt(j), words[i].charAt(j));
                    }else {
                        if(map2.get(pattern.charAt(j))!=words[i].charAt(j)) {
                            flag = false;
                            break innerLoop;
                        }
                    }
                }else {
                    if(map1.get(words[i].charAt(j))!=pattern.charAt(j)) {
                        flag = false;
                        break innerLoop;
                    }
                }
            }
            if(flag)
                res.add(words[i]);
        }
        return res;
    }
}