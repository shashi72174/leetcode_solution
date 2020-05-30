package com.leetcode;

public class ThirdNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 2, 2, 3, 1 };
		int[] arr = {1, 1, 2};
		System.out.println(thirdMax(arr));
	}

	public static int thirdMax(int[] nums) {
		if (nums.length == 2)
			return nums[0] > nums[1] ? nums[0] : nums[1];

		int firstNum = -1, secondNum = -1, thirdNum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= firstNum) {
				if(firstNum!=-1 && nums[i]!=firstNum)
					secondNum=firstNum;
				firstNum = nums[i];
			}else if (nums[i] >= secondNum) {
				if(secondNum!=-1 && nums[i]!=secondNum)
					thirdNum=secondNum;
				secondNum = nums[i];
			}else if (nums[i] >= thirdNum)
				thirdNum = nums[i];
		}
		return thirdNum>-2147483648 ? thirdNum : thirdNum==-2147483648 ? thirdNum : firstNum;
	}

}
