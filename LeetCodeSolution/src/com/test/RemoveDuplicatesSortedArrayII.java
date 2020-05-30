package com.test;

public class RemoveDuplicatesSortedArrayII {

	public static void main(String[] args) { //int[] arr = new int[] {1,1,1,2,2,3}; 	//int[] arr = new int[] {1,2,2,2}; //int[] arr = new int[] { 0, 0, 1, 1, 1, 1, 2, 2, 2, 4 }; //int[] arr = new int[] { 0, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4 };
		int[] arr = new int[] {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(arr));
	}
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int count = 0;
		for(int j=0;j<nums.length;j++) {
			if(nums[i]==nums[j] && count<2) {
				nums[i]=nums[j];
				i++;
				count++;
			}else if(nums[i]!=nums[j] && count<2) {
				nums[i]=nums[j];
				i++;
				count++;
			}else if(nums[i]==nums[j] && count<2) {
				nums[i]=nums[j];
				i++;
				count++;
			}else if(nums[i]==nums[j])
				count++;
			
			if(j<nums.length-1 && nums[j+1]!=nums[i-1])
				count=0;
		}
		return i;
	}
}