public class BuySellProblem {

    public static int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int buy = prices[0];
        int maxProfit=0;
        int sell = Integer.MIN_VALUE;
        for (int i=1;i<prices.length;i++) {
            if(buy > prices[i])
                buy = prices[i];
            else if(prices[i]>buy && maxProfit<(prices[i]-buy))
                maxProfit = prices[i]-buy;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int[] arr = new int[] { 7,1,5,3,6,4 };
        int[] arr = new int[] { 7,6,4,3,1 };
        System.out.println(maxProfit(arr));
    }
}