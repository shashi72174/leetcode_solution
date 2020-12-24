import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("johnsmith@mail.com");
        list1.add("john00@mail.com");
        list2.add("johnsmith@mail.com");
        list2.add("john_newyork@mail.com");


        System.out.println(list1.contains(list2));



    }
}
