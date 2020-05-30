package com.test;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,4,20,3,10,5};
		//int[] arr = new int[] {1,1,1};
		int givenSum = 33;
		int count = 0;
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = arr[i];
			if(sum == givenSum)
				count++;
			for(int j=i+1;j<arr.length;j++) {
				sum = sum + arr[j];
				if(sum == givenSum)
					count++;
			}
		}
		
		System.out.println(count);
	}

}
