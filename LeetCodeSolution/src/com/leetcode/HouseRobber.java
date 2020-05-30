package com.leetcode;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1 };
		// int[] nums = {2,1,1,2};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		/*
		 * int maxAmount = 0; int i=0; int sum = 0; while(i<nums.length) { sum = sum
		 * +nums[i]; i = i+2; } i = 1; maxAmount = sum; sum = 0; while(i<nums.length) {
		 * sum = sum +nums[i]; i = i+2; }
		 * 
		 * maxAmount = Math.max(maxAmount, sum);
		 * 
		 * return maxAmount;
		 */
		int maxAmount = 0;
		int i = 2;
		int[] arr = new int[nums.length];
		arr[0] = nums[0];
		arr[1] = nums[1];
		while (i < nums.length) {
			arr[i] = Math.max(arr[i - 1], nums[i] + arr[i - 2]);
			i++;
		}
		maxAmount = Arrays.stream(arr).max().getAsInt();

		/*
		 * 
		 * if(!stack.isEmpty() && stack.peek()<=nums[i]) { stack.push(nums[i]); i = i+2;
		 * } else if(stack.isEmpty()) { stack.push(nums[i]); i = i+2; }else i++;
		 * 
		 */

		/*
		 * while(!stack.isEmpty()) { maxAmount = maxAmount+stack.pop(); }
		 */
		return maxAmount;
	}

}
