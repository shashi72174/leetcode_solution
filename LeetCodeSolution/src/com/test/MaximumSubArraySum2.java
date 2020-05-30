package com.test;

public class MaximumSubArraySum2 {

	public static void main(String[] args) {
		int[] arr = {-2,2,5,-11,6};
		int current_sum=arr[0],max_sum=current_sum;
		
		for(int i=1;i<arr.length;i++) {
			current_sum=current_sum+arr[i];
			current_sum = Math.max(current_sum,arr[i]);
			max_sum = Math.max(current_sum, max_sum);
		}
		System.out.println(max_sum);
	}

}
