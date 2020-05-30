package com.test;

public class ContainsDuplicate3 {

	public static void main(String[] args) {
		int[] nums = {2147483647,-2147483647};
		System.out.println(containsDuplicate(nums,1,2147483647));
	}
	
	public static boolean containsDuplicate(int[] nums,int k,int t) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				long diff = nums[i]+Math.abs(nums[j]);
				if(diff==Integer.MIN_VALUE)
					return false;
				else if(Math.abs(j-i)<=k && Math.abs(diff)<=t)
					return true;
			}
		}
		return false;
    }

}
