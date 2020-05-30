package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class OddOccuringNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,6,4,1};
		
		Map<Integer,Integer> elementCount = new HashMap<Integer,Integer>();
		
		for(Integer i : nums) {
			if(elementCount.get(i)==null)
				elementCount.put(i, 1);
			else
				elementCount.put(i, elementCount.get(i).intValue()+1);
		}
		
		for(Integer key : elementCount.keySet()) {
			if(elementCount.get(key)%2==1)
				System.out.println(key);
		}
		
		
	}

}
