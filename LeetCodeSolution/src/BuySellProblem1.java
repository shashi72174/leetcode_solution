public class BuySellProblem1 {
    public static int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int maxProfit=0;
        int buy=prices[0],sell=0;
        boolean isBuy=true;
        for(int i=1;i<prices.length;i++) {
            if(buy>prices[i]) {
                buy = prices[i];
                isBuy=false;
            }else if(!isBuy && (prices[i-1]>prices[i] && prices[i-1]>buy)) {
                maxProfit=maxProfit+(prices[i-1]-buy);
                buy=prices[i];
            }else if(isBuy && i==prices.length-1 && prices[i-1]>prices[i] && prices[i-1]>buy)
                maxProfit = maxProfit+(prices[i-1]-buy);
            else if(maxProfit==0 && i==prices.length-1 && buy<prices[i])
                return prices[i]-buy;
            else if(maxProfit==0 && i==prices.length-1)
                return maxProfit;
            else if(!isBuy && i==prices.length-1)
                maxProfit = maxProfit+prices[i]-buy;
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        //int[] arr = new int[] { 7,1,5,3,6,4 };
        //int[] arr = new int[] { 6,1,3,2,4,7 };
        //int[] arr = new int[] { 7,6,4,3,1 };
        //int[] arr = new int[] { 1,2,3,4,5 };
        System.out.println(Integer.MIN_VALUE);
        int[] arr = new int[] { 1,4,2 };
        System.out.println(maxProfit(arr));
    }
}
