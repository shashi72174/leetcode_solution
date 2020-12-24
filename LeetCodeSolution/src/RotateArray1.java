public class RotateArray1 {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-100,3,99};
        int k = 2;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        int i=0;
        while(i<k) {
            int temp = nums[nums.length-1];
            for(int j=nums.length-1;j>=0;j--) {
                if(j==0)
                    nums[j]=temp;
                else
                    nums[j]=nums[j-1];
            }
            i++;
        }


    }
}
