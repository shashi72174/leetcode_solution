public class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    public static void main(String[] args) {
        int[] time = {60,60,60};
        System.out.println(numPairsDivisibleBy60(time));
    }

    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for(int i=0;i<time.length-1;i++) {
            for(int j=i+1;j<time.length;j++) {
                if((time[i]+time[j])%60==0)
                    count++;
            }
        }
        return count;
    }
}
