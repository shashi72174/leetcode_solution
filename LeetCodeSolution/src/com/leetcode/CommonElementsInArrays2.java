package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArrays2 {
	public static void main(String[] args) {
		/*
		 * int[] arr1 = {2,6,9,11,13,17}; int[] arr2 = {3,6,7,10,13,18}; int[] arr3 =
		 * {4,5,6,9,11,13};
		 */
		/*
		 * int arr1[] = {1, 5, 10, 20, 40, 80}; int arr2[] = {6, 7, 20, 80, 100}; int
		 * arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		 */

		int[] arr1 = { 4, 9, 5 };
		int[] arr2 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(commonElements(arr1, arr2)));
	}

	private static int[] commonElements(int[] arr1, int[] arr2) {
		List<Integer> commonElements = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonElements.add(arr2[j]);
					break;
				}
			}
		}
		int[] returnArr = commonElements.stream().distinct().mapToInt(i1 -> i1).toArray();
		return returnArr;
	}
}