public class RichestCustomerWealth {

    public static void main(String[] args) {
        //int[][] accounts = {{1,5},{7,3},{3,5}};
        //int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxSum=0;
        for(int i=0;i<accounts.length;i++) {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++) {
                sum = sum+accounts[i][j];
            }
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum;
    }
}