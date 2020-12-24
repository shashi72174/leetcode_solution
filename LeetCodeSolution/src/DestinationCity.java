import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        List<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        List<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Sao Paulo");
        paths.add(list1);
        paths.add(list2);
        paths.add(list3);
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap<>();
        String source = null,destination=null;
        for(List<String> l : paths) {
            if(map.containsKey(l.get(0)))
                map.put(l.get(0),map.get(l.get(0))+1);
            else
                map.put(l.get(0),1);

            if(map.containsKey(l.get(1)))
                map.put(l.get(1),map.get(l.get(1))+1);
            else
                map.put(l.get(1),1);
        }
        //find out source and destination
        for(List<String> l : paths) {
            if(map.get(l.get(0))==1)
                source = l.get(0);

            if(map.get(l.get(1))==1)
                destination = l.get(1);
        }
        return destination;
    }
}