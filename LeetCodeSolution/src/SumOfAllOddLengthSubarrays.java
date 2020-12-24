public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));

    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<=arr.length;j+=2) {
                int j_l = i;
                while (j_l < j) {
                    sum += arr[j_l++];
                }
            }
        }
        return sum;
    }
}
