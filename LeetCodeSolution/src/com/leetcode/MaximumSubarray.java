package com.leetcode;

public class MaximumSubarray {

	public static void main(String[] args) {
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println((-2147483647>Integer.MIN_VALUE));
		//int[] nums = {1,-3,2,1,-1};
		int[] nums = {-2147483647};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
        int max = -2147483648,sum=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>max)
        		max = nums[i];
        	sum = nums[i];
        	for(int j=i+1;j<nums.length;j++) {
        		if(sum+nums[j]>max) {
        			max = sum+nums[j];
        		}
        		sum=sum+nums[j];
        	}
        	sum=0;
        }
        return max;
        
    }

}
