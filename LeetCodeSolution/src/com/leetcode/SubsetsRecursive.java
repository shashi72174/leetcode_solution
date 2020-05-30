package com.leetcode;

import java.util.Arrays;

public class SubsetsRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		Integer[] arr = { 1, 2, 3, 4, 5 };
		allSubsets(arr);

	}

	public static void allSubsets(Integer[] arr) {
		Integer[] subset = new Integer[arr.length];
		helper(arr,subset,0);
		  
	}

	private static void helper(Integer[] arr, Integer[] subset, Integer i) {
		// TODO Auto-generated method stub
		if(i==arr.length)
			System.out.println(Arrays.deepToString(subset));
		else {
			subset[i]=null;
			helper(arr,subset,i+1);
			subset[i] = arr[i];
			helper(arr,subset,i+1);
		}
	}
	
	

}
