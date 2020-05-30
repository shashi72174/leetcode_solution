package com.leetcode;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, 3, -4 };
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		int max = -2147483648, prod = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
			prod = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (prod * nums[j] > max) {
					max = prod * nums[j];
				}
				prod = prod * nums[j];
			}
			prod = 1;
		}
		return max;
	}

	/*
	 * public static int maxProductByDP(int[] nums) {
	 * 
	 * int max = -2147483648,prod=1; for(int i=0;i<nums.length;i++) {
	 * if(nums[i]>max) max = nums[i]; prod = nums[i]; for(int
	 * j=i+1;j<nums.length;j++) { if(prod*nums[j]>max) { max = prod*nums[j]; }
	 * prod=prod*nums[j]; } prod=1; } return max;
	 * 
	 * 
	 * int maxProd = nums[0]; int[] dptable = new int[nums.length]; dptable[0] =
	 * maxProd;
	 * 
	 * 
	 * for(int i=1;i<nums.length;i++) { dptable[i]= }
	 * 
	 * 
	 * }
	 */

}
