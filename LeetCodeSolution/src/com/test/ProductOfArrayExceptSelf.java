package com.test;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	int product=1;
        	for(int j=0;j<nums.length;j++) {
        		if(j!=i) 
        			product=product*nums[j];
        	}
        	res[i]=product;
        }
        return res;
    }
}