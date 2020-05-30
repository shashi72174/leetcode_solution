package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1,2,3,0,0,0 };
		int m = 1, n = 1;
		int[] nums2 = { 2,5,6 };
		merge(nums1, m, nums2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		/*
		 * int k = 0;
		 * 
		 * for (int i = 0; i < n; i++) { for (int j = k; j < m; j++) { if (nums1[j] ==
		 * 0) nums1[j] = nums2[i]; else if (nums1[j] > nums2[i]) { int temp = nums1[j];
		 * nums1[j] = nums2[i]; nums1[j + 1] = temp; k = j; break; } else {
		 * 
		 * } }
		 * 
		 * if (m == 0 && nums1[m] == 0) nums1[m] = nums2[i]; if (k >= m) { if (nums1[k]
		 * > 0 && nums1[k] < nums2[i]) nums1[k + 1] = nums2[i]; } k++; }
		 * System.out.println(Arrays.toString(nums1));
		 */

		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : nums1) {
			list.add(i);
		}
		for (Integer i : nums2) {
			list.add(i);
		}
		List<Integer> removeList = new ArrayList<Integer>();
		removeList.add(new Integer(0));
		list.removeAll(removeList);
		Collections.sort(list);
		int index = 0;
		for(Integer i : list) {
			nums1[index] = i;
			index++;
		}
		System.out.println(Arrays.toString(nums1));

	}

}
