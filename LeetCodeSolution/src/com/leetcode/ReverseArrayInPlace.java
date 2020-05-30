package com.leetcode;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(reverseArray(arr)));
	}

	private static int[] reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i<=j) {
			int temp = arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		return arr;
	}
}