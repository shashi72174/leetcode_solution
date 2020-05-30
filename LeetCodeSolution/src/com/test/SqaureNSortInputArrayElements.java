package com.test;

import java.util.Arrays;

public class SqaureNSortInputArrayElements {
	public static void main(String[] args) {
		int[] arr = new int[] {-4,-1,0,3,10};
		int[] res = sortedSquares(arr);
		System.out.println(Arrays.toString(res));
		
	}

	public static int[] sortedSquares(int[] arr) {
		int[] squares =  new int[arr.length];
		for(int i=0;i<arr.length;i++) 
			squares[i] = arr[i]*arr[i];
		
		int temp = 0;
		for(int i=0;i<squares.length;i++) {
			for(int j=i+1;j<(squares.length);j++) {
				if(squares[i]>squares[j]) {
					temp = squares[i];
					squares[i] = squares[j];
					squares[j] = temp;
				}
			}
		}
		return squares;
    }
}