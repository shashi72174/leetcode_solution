package com.test;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(arr, val));
	}
	
	public static int removeElement(int[] nums, int val) {
        int newArrIndex = 0;
        if (nums.length == 0 ) return newArrIndex;
        
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]!=val)
                nums[newArrIndex++] = nums[i];
        }
        return newArrIndex--;
    }
}