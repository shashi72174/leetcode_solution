import java.util.*;

public class FindAndReplaceInString {

    public static void main(String[] args) {
        String S = "vmokgggqzp";
        int[] indexes = {3,5,1};
        String[] sources = {"kg","ggq","mo"};
        String[] targets = {"s","so","bfr"};
        System.out.println(findReplaceString(S,indexes,sources,targets));
    }

    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        String replacedString="";
        int indexesIdx=0,i=0;
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        for(int j=0;j<indexes.length;j++) {
            List<String> list = new ArrayList<>();
            list.add(sources[j]);
            list.add(targets[j]);
            map.put(indexes[j], list);
        }
        while(i<S.length()) {
            if(indexesIdx<indexes.length) {
                if (map.containsKey(i)) {
                    List<String> list = map.get(i);
                    String temp = S.substring(i, i + list.get(0).length());
                    if (temp.equals(list.get(0)))
                        replacedString = replacedString + list.get(1);
                    else
                        replacedString = replacedString + S.substring(i, i+list.get(0).length());
                    i = i + temp.length();
                    indexesIdx++;
                }else {
                    replacedString = replacedString + S.charAt(i);
                    i++;
                }
            }else {
                replacedString = replacedString + S.charAt(i);
                i++;
            }
        }
        return replacedString;
    }
}