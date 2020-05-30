package com.test;

public class LongestSubArrayGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,4,20,3,10,5};
		int givenSum = 33;
		int sum = 0;
		int left = 0,right = left;
		boolean flag = false;
		while(left<=(arr.length-1)) {
			sum = sum + arr[left];
			if(sum == givenSum) {
				System.out.println(left +"\t"+right);
				break;
			}
			right++;
			while(right<=(arr.length-1)) {
				sum = sum + arr[right];
				if(sum == givenSum) {
					System.out.println(left +"\t"+right);
					flag = true;
					break;
				}
			right++;	
			}
			if(flag)
				break;
			sum = 0;
			left++;
			right=left;
		}
		
	}

}
