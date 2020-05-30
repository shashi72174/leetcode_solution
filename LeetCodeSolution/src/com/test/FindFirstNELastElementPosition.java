package com.test;

import java.util.Arrays;

public class FindFirstNELastElementPosition {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,6,7,7,8,8,8,12};
		int taget = 5;
		System.out.println(Arrays.toString(searchRange(arr, taget)));
		
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1,-1};
        if(nums.length==1 && nums[0]==target) {
        	result[0]=0;
        	result[1]=0;
        	return result;
        }
        for(int i=0;i<nums.length;i++) {
        	if(nums[i] == target) {
        		if(result[0]==-1)
        			result[0] = i;
        		else
        			result[1] = i;
        	}
        }
        if(result[0]!=-1 && result[1]==-1)
        	result[1] = result[0];
        return result;
    }
}