package com.leetcode;

public class JumpGame {

	public static void main(String[] args) {
		// int[] arr = {2,5,0,0};
		// int[] arr = {2,0};
		// int[] arr = {2,3,1,1,4};
		// int[] arr = {1,2};
		// int[] arr = { 3, 2, 1, 0, 4 };
		//int[] arr = { 3, 0, 8, 2, 0, 0, 1 };
		// int[] arr = {1,2,3};
		// int[] arr = {1,1,0,1};
		// int[] arr = { 1, 1, 2, 2, 0, 1, 1 };
		//int[] arr = {2,0,1,0,1};
		int[] arr = {2,0,1,1,2,1,0,0,0};
		System.out.println(canJump(arr));
	}

	public static boolean canJump(int[] nums) {
		int i = 0;
		int jump = -9999999;
		int backtrackindex = 0;
		int backtrackjump = 0;
		int prevjump=0;
		while (i < nums.length) {
			if (i == nums.length - 1)
				return true;
			jump = nums[i];
			if(i==0) {
				backtrackjump=jump;
				prevjump=backtrackjump;
			}else 
				backtrackjump=jump;
			if (jump == 0)
				return false;
			while (jump > 0) {
				i++;
				jump--;
			}
			if (i >= nums.length - 1)
				return true;

			backtrackindex = i;
			if (nums[i] == 0) {
				if(backtrackjump==1) {
					if(nums[backtrackindex-backtrackjump]==1 && nums[prevjump+nums[backtrackindex-backtrackjump]]==0)
						return false;
				}
				while (backtrackindex > 0) {
					backtrackindex--;
					if (nums[backtrackindex] > nums.length)
						return true;
					if (nums[backtrackindex] < nums.length && nums[backtrackindex] != 0) {
						if (backtrackindex + nums[backtrackindex] != i) {
							i = backtrackindex;
							break;
						}
					}
				}
				if (nums[i] == 0)
					return false;
				
			}
			prevjump = backtrackjump;
		}
		return true;
	}
}