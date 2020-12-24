import java.util.Arrays;

public class FinalPricesWithASpecialDiscountInAShop {

    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        System.out.println(Arrays.toString(finalPrices(prices)));

    }

    public static int[] finalPrices(int[] prices) {
        int[] discounts = new int[prices.length];
        for(int i=0;i<prices.length;i++) {
            if(i==prices.length-1)
                discounts[i]=prices[i];
            else {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] <= prices[i]) {
                        discounts[i] = prices[i] - prices[j];
                        break;
                    } else
                        discounts[i] = prices[i];
                }
            }
        }
        return discounts;
    }
}
