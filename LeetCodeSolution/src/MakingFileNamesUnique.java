import java.util.*;

public class MakingFileNamesUnique {
    public static void main(String[] args) {
        String[] names = {"kaido","kaido(1)","kaido","kaido(1)"};
        System.out.println(Arrays.toString(getFolderNames(names)));
    }

    public static String[] getFolderNames(String[] names) {
        List<String> list = new ArrayList<>();
        int i=0;
        for(String s : names) {
            if(!list.contains(s))
                list.add(s);
            else {
                int getNextCount=0;
                for(int j=0;j<list.size();j++) {
                    if(list.get(j).contains("(")) {
                        if(s.contains("(")) {
                            if(list.get(j).substring(0,list.get(j).indexOf("(")).equals(s.substring(0,s.indexOf("("))))
                                getNextCount++;
                        }else {
                            if(list.get(j).substring(0,list.get(j).indexOf("(")).equals(s))
                                getNextCount++;
                        }
                    }else {
                        if(s.contains("(")) {
                            if(list.get(j).equals(s.substring(0,s.indexOf("("))))
                                getNextCount++;
                        }else {
                            if(list.get(j).equals(s))
                                getNextCount++;
                        }
                    }
                }
                if(s.contains("("))
                    list.add(s.substring(0,s.indexOf("("))+"("+getNextCount+")");
                else
                    list.add(s+"("+getNextCount+")");
            }
        }
        return list.toArray(new String[list.size()]);
    }
}