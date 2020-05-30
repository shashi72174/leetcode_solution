package com.leetcode;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = { 0,0,1 };
		moveZeros(arr);
	}

	private static void moveZeros(int[] arr) {
		int outer = 0;
		int inner = 0;
		while (outer < arr.length) {
			while (inner < arr.length - 1) {
				if (arr[inner] == 0) {
					int temp = arr[inner + 1];
					arr[inner + 1] = arr[inner];
					arr[inner] = temp;
				}
				inner++;
			}
			outer++;
			inner = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}