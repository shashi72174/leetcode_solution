public class NonDecreasingArray {

    public static void main(String[] args) {
        int[] nums = new int[] {4,2,1};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        boolean changeFlag = true;
        int[] newArr = new int[nums.length+1];
        newArr[0]=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length) {
            if(newArr[i]<=nums[i])
                newArr[i+1]=nums[i];
            else {
                if(changeFlag){
                    if(nums[i]<newArr[i]) {
                        if(newArr[i-1]>nums[i])
                            newArr[i+1]=newArr[i];
                        else {
                            newArr[i] = nums[i] - 1;
                            newArr[i+1] = nums[i];
                        }
                    }else
                        newArr[i+1]=newArr[i];
                    changeFlag=false;
                }else
                    return false;
            }
            i++;
        }
        return true;
    }
}