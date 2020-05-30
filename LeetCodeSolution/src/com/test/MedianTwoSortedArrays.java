package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class MedianTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = new int[] {1, 2};
		int[] nums2 = new int[] {3, 4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		list.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
		Collections.sort(list);
		int n = list.size();
		if(list.size()%2==0) 
			return (double)(list.get((n-1)/2)+list.get(n/2))/2;
		return (double)list.get(list.size()/2);
    }
}