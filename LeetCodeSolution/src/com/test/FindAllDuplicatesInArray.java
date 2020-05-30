package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicates2(arr));

	}

	public static List<Integer> findDuplicates1(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> integerList1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
		for (int i = 0; i < integerList1.size(); i++) {
			if (Collections.frequency(integerList1, integerList1.get(i)) == 2 && !list.contains(integerList1.get(i)))
				list.add(integerList1.get(i));
		}
		Collections.sort(list);
		return list;
	}

	public static List<Integer> findDuplicates2(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			int counter = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && !list.contains(nums[i]))
					counter++;
			}
			if (counter == 2)
				list.add(nums[i]);
		}
		Collections.sort(list);
		return list;
	}

}
