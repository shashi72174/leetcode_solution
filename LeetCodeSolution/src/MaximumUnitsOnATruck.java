import java.util.*;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}}; //int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 10; //int truckSize = 4;
        System.out.println(maximumUnits(boxTypes,truckSize));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum = 0;
        Arrays.sort(boxTypes, Comparator.comparingInt(value -> -value[1]));
        for(int i=0;i<boxTypes.length;i++) {
            if(truckSize>boxTypes[i][0])
                sum+=boxTypes[i][0]*boxTypes[i][1];
            else
                sum+=(truckSize)*boxTypes[i][1];
            truckSize = truckSize-boxTypes[i][0];
            if(truckSize<=0)
                break;
        }
        return sum;
    }
}