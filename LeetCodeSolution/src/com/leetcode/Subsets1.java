package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(subsets1(arr));
	}

	public static List<List<Integer>> subsets1(int[] nums) {
		List<List<Integer>> mainList = new ArrayList<List<Integer>>();
		mainList.add(new ArrayList<Integer>());
		for (int i = 0; i < nums.length; i++) {
			List<Integer> set = new ArrayList<Integer>();
			set.add(nums[i]);
			mainList.add(set);
			for (int j = i + 1; j < nums.length; j++) {
				set = new ArrayList<Integer>(mainList.get(mainList.size() - 1));
				set.add(nums[j]);
				mainList.add(set);
				for (int k = i - 1; k >= 0; k--) {
					List<Integer> list = new ArrayList<Integer>(mainList.get(mainList.size() - 1));
					list.add(0, (nums[k]));
					mainList.add(list);
				}
			}

		}

		return mainList;
	}
}
