import java.util.*;

public class Contacts {
    public static void main(String[] args) {
        String[][] queries = new String[6][2];
        queries[0] = new String[] {"add","hack"};
        queries[1] = new String[] {"add", "hackerrank"};
        queries[2] = new String[] {"find", "hac"};
        queries[3] = new String[] {"add", "ker"};
        queries[4] = new String[] {"find","hak"};
        queries[5] = new String[] {"find","k"};
        System.out.println(Arrays.toString(contacts(queries)));
    }

    private static int[] contacts(String[][] queries) {
        List<Integer> result = new ArrayList<Integer>();
        List<String> list = new ArrayList<String>();
        for (String[] query : queries) {
            switch(query[0]) {
                case "add" : list.add(query[1]);
                    break;
                case "find" : result.add((int)list.parallelStream().filter(s -> s.contains(query[1])).count());
                    break;
            }
        }
        return result.parallelStream().mapToInt(s -> s).toArray();
    }
}
/*
/*List<Integer> result = new ArrayList<Integer>();
        Map<String,Integer> addToMap = new HashMap<String,Integer>();
        for (String[] query : queries) {
            if(query[0].equals("add")){
                if(addToMap.get(query[0])==null)
                    addToMap.put(query[1],1);
                else
                    addToMap.put(query[1],addToMap.get(query[1])+1);
            }else{
                if (addToMap.containsKey(query[1]))
                    result.add(addToMap.get(query[1]));
                else
                    result.add((int) addToMap.keySet().parallelStream().filter(s -> s.contains(query[1])).count());

            }

        }
        return result.stream().mapToInt(s -> s).toArray();*/