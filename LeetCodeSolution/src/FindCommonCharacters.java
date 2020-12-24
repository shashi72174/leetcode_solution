import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] arr = new String[] {"cool","lock","cook"};
        System.out.println(commonChars(arr));
    }

    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<String>();
        if(A.length==0) return null;
        String bigStr = A[0];
        for(int i=0;i<bigStr.length();i++) {
            boolean flag = true;
            if(list.contains(""+bigStr.charAt(i))) {
                //find number of occurannce of the character in each strings

            }else {
                for(int j=1;j<A.length;j++) {
                    if(!A[j].equals(bigStr) && !A[j].contains(""+bigStr.charAt(i))) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) {
                if(!list.contains(""+bigStr.charAt(i)))
                    list.add("" + bigStr.charAt(i));
            }
        }
        return list;
    }
}