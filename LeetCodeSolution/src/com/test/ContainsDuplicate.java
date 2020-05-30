package com.test;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		System.out.println(containsDuplicate(nums));
		
	}
	
	public static boolean containsDuplicate(int[] nums) {
		//List<Integer> intList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(!set.add(i)){
	            return true;
	        }
	    }
	 
	    return false;
    }

}
