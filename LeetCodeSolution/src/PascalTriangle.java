import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=4;
        System.out.println(generate(n));
    }


    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        for(int i = 2;i<=n;i++) {
            List<Integer> localList = list.get(list.size()-1);
            List<Integer> res = new ArrayList<>();
            int sum=0;
            for(int j=0;j<localList.size();j++) {
                int val = localList.get(j);
                sum=sum+val;
                res.add(sum);
                sum=val;
            }
            res.add(1);
            list.add(res);
        }
        return list;
    }


}
/*
if(j%2==1){
        res.add(sum+localList.get(j));
        sum=localList.get(j);
        }else if(j==localList.size()-1)
        res.add(sum+localList.get(j));
        else
        sum=sum+localList.get(j);*/
