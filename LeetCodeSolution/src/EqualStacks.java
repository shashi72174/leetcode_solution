import java.util.*;

public class EqualStacks {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();
        h1.add(3);h1.add(2);h1.add(1);h1.add(1);h1.add(1);
        h2.add(4);h2.add(3);h2.add(2);
        h3.add(1);h3.add(1);h3.add(4);h3.add(1);
        System.out.println(equalStacks(h1, h2, h3));
        //System.out.println(System.currentTimeMillis());

    }
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = h1.stream().mapToInt(i -> i).sum();
        int sum2 = h2.stream().mapToInt(i -> i).sum();
        int sum3 = h3.stream().mapToInt(i -> i).sum();
        while(h1.size()>0 || h2.size()>0 || h3.size()>0) {
            int min = getMin(h1, h2, h3);
            if(sum1==sum2 && sum2==sum3)
                return sum1;
            if(sum1>min)
                sum1-=h1.remove(0);
            if(sum2>min)
                sum2-=h2.remove(0);
            if(sum3>min)
                sum3-=h3.remove(0);
        }
        return 0;
    }

    public static int getMin(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = h1.stream().mapToInt(i -> i).sum();
        int sum2 = h2.stream().mapToInt(i -> i).sum();
        int sum3 = h3.stream().mapToInt(i -> i).sum();
        return Integer.min(Integer.min(sum1,sum2),sum3);
    }
}