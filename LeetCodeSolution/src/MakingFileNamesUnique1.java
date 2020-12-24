import java.util.*;
import java.util.stream.Collectors;

public class MakingFileNamesUnique1 {
    public static void main(String[] args) {
        String[] names = {"kaido","kaido(1)","kaido","kaido(1)","kaido(1)"};
        //String[] names = {"pes","fifa","gta","pes(2019)"};
        //String[] names = {"kingston(0)","kingston","kingston"};
        //String[] names = {"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"};
        //String[] names = {"wano","wano","wano","wano"};
        System.out.println(Arrays.toString(getFolderNames(names)));
    }

    public static String[] getFolderNames(String[] names) {
        List<String> asList =  Arrays.asList(names);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        String[] res = new String[names.length];
        Iterator<String> itr = asList.iterator();
        while(itr.hasNext()) {
            String temp = itr.next();
            if (map.containsKey(temp)) {
                List<String> list = map.keySet().stream().collect(Collectors.toList());
                int idx=0;
                for(int i=0;i<list.size();i++) {
                    if(list.get(i).startsWith(temp)) {
                        if (list.get(i).contains("("))
                            idx = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("(") + 1, list.get(i).indexOf(")"))) + 1;
                    }
                }
                map.put(temp+"("+idx+")",1);
            }else
                map.put(temp, 1);
        }
        int i=0;
        for (String s:map.keySet()) {
            res[i]=s;
            i++;
        }
        return res;
    }
}