import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(-129);     list.add(-129); //       list.add(3);       list.add(2);        list.add(1);
        int i = 0;
        int j = list.size()-1;
        while(i<=j) {
            if(list.get(i).intValue()!=list.get(j).intValue())
                System.out.println(false);
            else {
                i++;j--;
            }

        }
        System.out.println(true);
    }
}
