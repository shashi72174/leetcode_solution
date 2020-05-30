package com.test;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		int[] arr = {-2,2,5,-11,6};
		List<Integer> list = new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
				list.add(sum);
			}
			sum=0;
		}
		System.out.println(list.stream().mapToInt(k -> k).max().getAsInt());
		
	}

}
