public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int mainConsectiveOnes = 0, consectiveOnes = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1)
                mainConsectiveOnes = Math.max(mainConsectiveOnes,++consectiveOnes);
            else
                consectiveOnes=0;
        }
        return mainConsectiveOnes;
    }
}