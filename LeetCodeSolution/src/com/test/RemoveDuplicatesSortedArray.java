package com.test;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		// int[] arr = new int[] {1,1,1,2,2,2,3,3};
		// int[] arr = new int[] {1,1,1,2,2,3};
		// int[] arr = new int[] {0,0,1,1,1,1,2,3,3};
		// int[] arr = new int[] {1,2,2,2};
		// int[] arr = new int[] { 0, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4 };
		int[] arr = new int[] { 0, 0, 1, 1, 1, 1, 2, 2, 2, 4 };
		System.out.println(removeDuplicates(arr));
	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int count = 0;
		for (int j = 0; j < nums.length; j++) {
			/*
			 * if(i!=0 && nums[i-1]!=nums[j]) count=0;
			 */
			if (nums[i] != nums[j]) {
				count = 0;
				count++;
				nums[i] = nums[j];
				i++;
			} else if (nums[i] == nums[j] && count < 2) {
				if (i!=0 && nums[i - 1] != nums[j] && nums[i - 2] != nums[j]) {
					count++;
					nums[i] = nums[j];
					i++;
				} else if (i!=0 && nums[i - 1] == nums[j] && nums[i - 2] != nums[j]) {
					count++;
					nums[i] = nums[j];
					i++;
				} else {
					nums[i] = nums[j];
					i++;
					count++;
				}

			} else if (nums[i] == nums[j]) {
				if (nums[i - 1] != nums[j])
					count = 0;
				if (nums[i - 1] != nums[j] && nums[i - 2] != nums[j]) {
					count++;
					nums[i] = nums[j];
					i++;
				} else if (nums[i - 1] == nums[j] && nums[i - 2] != nums[j]) {
					count++;
					nums[i] = nums[j];
					i++;
				} else
					count++;
			} else {
				if (nums[i - 1] != nums[j] && nums[i - 2] != nums[j]) {
					count = 0;
					count++;
					nums[i] = nums[j];
					i++;
				} else if (nums[i - 1] == nums[j] && nums[i - 2] != nums[j]) {
					count = 0;
					count++;
					nums[i] = nums[j];
					i++;
				}
				/*
				 * count=0; count++; nums[i] = nums[j]; i++;
				 */
			}

		}
		System.out.println(Arrays.toString(nums));
		return i;
	}

}
