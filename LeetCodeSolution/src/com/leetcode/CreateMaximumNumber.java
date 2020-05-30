package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CreateMaximumNumber {

	public static void main(String[] args) {
		//int[] nums1 = {3, 4, 6, 5};
		int[] nums1 = {3, 9};
		//int[] nums2 = {9, 1, 2, 5, 8, 3};
		int[] nums2 = {8, 9};
		int k = 3;
		maxNumber(nums1, nums2, k);
		
	}
	
	public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
		List<Integer> retList = new ArrayList<Integer>();
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        
        int nums1MaxIndex = list1.indexOf(Collections.max(list1));
        int nums2MaxIndex = list2.indexOf(Collections.max(list2));
        
        
        if(k==nums1.length+nums2.length) {
        	
        }else {
        	if(nums1MaxIndex==nums2MaxIndex) {
        		if(nums1MaxIndex==list1.size()-1 && nums2MaxIndex==list2.size()-1) {
        			if(list1.get(nums1MaxIndex-1)>list2.get(nums2MaxIndex-1)) {
        				retList.add(list2.get(nums2MaxIndex));
        				nums2MaxIndex++;
        			}else {
        				retList.add(list1.get(nums1MaxIndex));
        				nums1MaxIndex++;
        			}
        		}
        		k--;
        	}else {
        		if(list1.get(nums1MaxIndex)>list2.get(nums2MaxIndex)) {
    				retList.add(list1.get(nums1MaxIndex));
    				nums1MaxIndex++;
        		}else {
        			retList.add(list2.get(nums2MaxIndex));
        			nums2MaxIndex++;
        		}
        	}
        	
        	
        	
        	
        }
        
        int[] array = retList.stream().mapToInt(i->i).toArray();
        return array;
    }

}
