public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        int buy = prices[0],sell = 0;
        for(int i=1;i<prices.length;i++) {
            if(buy>prices[i])
                buy = prices[i];
            else if(buy<prices[i] && i!=prices.length -1 && prices[i+1]<prices[i]) {
                sell = prices[i];
                sum += sell-buy;
                buy = prices[i];
                sell = 0;
            }else if(i==prices.length-1 && sell==0)
                sum += prices[i]-buy;
        }
        return sum;
    }
}
