package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KMostFrequentElements {
	public static void main(String[] args) {
		//int[] nums = {1,2};
		//int[] nums = {4,1,-1,2,-1,2,3};
		int[] nums = {1,1,1,2,2,3};
		int k=3;
		System.out.println(Arrays.toString(kMostFrequentElements(nums,k)));
	}
	private static int[] kMostFrequentElements(int[] nums, int k) {
		int[] arr = new int[k];
		Map<Integer,Integer> elementCount = new HashMap<Integer,Integer>();
		for(int i : nums) {
			if(elementCount.get(i)==null)
				elementCount.put(i, 1);
			else
				elementCount.put(i, elementCount.get(i).intValue()+1);
		}
		int pushCount = 0;
		
		Map<Integer, Integer> result = elementCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		for(Integer key : result.keySet()) {
			arr[pushCount] = key;
			pushCount++;
			if(pushCount==k)
				break;
		}
		
		return arr;
	}
}