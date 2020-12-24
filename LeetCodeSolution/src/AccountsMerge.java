import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class AccountsMerge {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(); list1.add("David");
        list1.add("David4@mail.com"); list1.add("David2@mail.com"); list1.add("David4@mail.com");

        List<String> list2 = new ArrayList<String>(); list2.add("John");
        list2.add("John7@mail.com"); list2.add("John5@mail.com"); list2.add("John3@mail.com");

        List<String> list3 = new ArrayList<String>(); list3.add("Fern");
        list3.add("Fern6@mail.com"); list3.add("Fern4@mail.com"); list3.add("Fern5@mail.com");

        List<String> list4 = new ArrayList<String>(); list4.add("Celine");
        list4.add("Celine0@mail.com"); list4.add("Celine7@mail.com"); list4.add("Celine7@mail.com");

        List<String> list5 = new ArrayList<String>(); list5.add("Gabe");
        list5.add("Gabe8@mail.com"); list5.add("Gabe8@mail.com"); list5.add("Gabe1@mail.com");

        List<String> list6 = new ArrayList<String>(); list6.add("Ethan");
        list6.add("Ethan1@mail.com"); list6.add("Ethan6@mail.com"); list6.add("Ethan6@mail.com");

        List<String> list7 = new ArrayList<String>(); list7.add("Celine");
        list7.add("Celine4@mail.com"); list7.add("Celine8@mail.com"); list7.add("Celine6@mail.com");

        List<String> list8 = new ArrayList<String>(); list8.add("Celine");
        list8.add("Celine0@mail.com"); list8.add("Celine0@mail.com"); list8.add("Celine4@mail.com");


        List<List<String>> mainList = new ArrayList<List<String>>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);
        mainList.add(list6);
        mainList.add(list7);
        mainList.add(list8);
        System.out.println(accountsMerge(mainList));
    }

    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> list = new CopyOnWriteArrayList<>();
        list.add(accounts.get(0));
        boolean flag = true;
        for(int i=1;i<accounts.size();i++) {
            for(int j=0;j<list.size();j++) {
                if(accounts.get(i).get(0).equals(list.get(j).get(0))) {
                    //check whether accounts email is already present in resultant list if it is then merge or else add to resultant list
                    flag=false;
                    List<String> list1 = checkCommonEmails(list.get(j).subList(1,list.get(j).size()), accounts.get(i).subList(1,accounts.get(i).size()));
                    if(list1!=null && list1.size()>0) {
                        list1.add(0,accounts.get(i).get(0));
                        list.set(j, list1);
                    }else {
                        list.add(accounts.get(i));
                        break;
                    }
                }
            }
            if(flag)
                list.add(accounts.get(i));
            flag = true;
        }
        return list;
    }

    private static List<String> checkCommonEmails(List<String> list, List<String> subList) {
        if(list.stream().filter(subList::contains).collect(Collectors.toList()).size()>0) {
            HashSet hs = new HashSet(list);
            hs.addAll(subList);
            return new ArrayList(hs);
        }
        return null;

    }
}
