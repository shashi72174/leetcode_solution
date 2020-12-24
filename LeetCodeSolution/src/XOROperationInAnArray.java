public class XOROperationInAnArray {

    public static void main(String[] args) {
        int n = 10, start = 5;
        System.out.println(xorOperation(n,start));
    }

    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++) {
            nums[i]=start+(2*i);
        }
        int res = nums[0];
        for(int i=1;i<nums.length;i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}