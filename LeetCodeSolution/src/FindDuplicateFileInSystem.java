import java.util.*;

public class FindDuplicateFileInSystem {

    public static void main(String[] args) {
        //String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"};
        System.out.println(findDuplicate(paths));
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String path : paths) {
            String[] splitArr = path.split(" ");
            String fullPath = splitArr[0];
            for(int i=1;i<splitArr.length;i++) {
                if(map.containsKey(splitArr[i].substring(splitArr[i].indexOf("(")+1, splitArr[i].indexOf(")")))) {
                    List<String> list = map.get(splitArr[i].substring(splitArr[i].indexOf("(")+1, splitArr[i].indexOf(")")));
                    list.add(fullPath+"/"+splitArr[i].substring(0,splitArr[i].indexOf("(")));
                    map.put(splitArr[i].substring(splitArr[i].indexOf("(")+1, splitArr[i].indexOf(")")), list);
                }else {
                    List<String> list = new ArrayList<String>();
                    list.add(fullPath+"/"+splitArr[i].substring(0, splitArr[i].indexOf("(")));
                    map.put(splitArr[i].substring(splitArr[i].indexOf("(") + 1, splitArr[i].indexOf(")")), list);
                }
            }
        }
        for(String fileContent : map.keySet()) {
            if(map.get(fileContent).size()>1)
                res.add(map.get(fileContent));
        }
        return res;
    }
}
