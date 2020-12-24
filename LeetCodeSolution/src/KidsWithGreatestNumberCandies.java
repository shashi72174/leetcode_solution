import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    public static void main(String[] args) {
        int[] candies = new int[] {4,2,1,1,2};
        int extracCandies=1;
        System.out.println(kidsWithCandies(candies,extracCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++) {
            int temp = candies[i]+extraCandies;
            boolean flag = false;
            for(int j=0;j<candies.length;j++) {
                if(i!=j){
                    if(candies[j]>temp) {
                        flag = false;
                        break;
                    }else
                        flag = true;
                }
            }
            list.add(flag);
        }
        return list;
    }
}
