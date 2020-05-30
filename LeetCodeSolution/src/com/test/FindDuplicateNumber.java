package com.test;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		//int[] arr = {3,1,3,4,2};
		int[] arr = {-3,-1,-3,5,-3,2};
		int duplicate=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate=arr[i];
					break;
				}
			}
		}
		System.out.println(duplicate);
	}
}