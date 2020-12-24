import java.util.*;
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        java.lang.String s = "spo";
        System.out.println(sortString(s));
    }
    public static String sortString(String s) {
        String res = "";
        List<Character> list = new ArrayList<>();
        for (int j = 0; j < s.length(); j++)
            list.add(s.charAt(j));
        Collections.sort(list);
        int k = 0;
        while(list.size()>0) {
            while (k < list.size()) {
                if (res.length() == 0) {
                    res += list.get(k);
                    list.remove(k);
                } else {
                    if (res.charAt(res.length() - 1) != list.get(k)) {
                        res += list.get(k);
                        list.remove(k);
                    } else
                        k++;
                }
            }
            if(list.size()>0) {
                res += list.get(list.size() - 1);
                list.remove(list.size() - 1);
                k = list.size() - 1;
                while (k >= 0) {
                    if (res.charAt(res.length() - 1) != list.get(k)) {
                        res += list.get(k);
                        list.remove(k);
                    }
                    k--;
                }
            }
            if(list.size()==1) {
                res += list.get(0);
                list.remove(0);
            }else if(list.size()==0)
                return res;
            else {
                res+=list.get(0);
                list.remove(0);
                k = 0;
            }
        }
        return res;
    }
}