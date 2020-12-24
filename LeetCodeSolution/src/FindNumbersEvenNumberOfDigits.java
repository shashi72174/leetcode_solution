public class FindNumbersEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = new int[] {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int counter = 0;
        for(int i=0;i<nums.length;i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() % 2 == 0)
                counter++;
        }
        return counter;
    }
}
