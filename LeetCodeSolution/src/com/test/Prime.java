package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println(checkPrime(2)); System.out.println(checkPrime(2,1));
		 * System.out.println(checkPrime(2,1,3));
		 * System.out.println(checkPrime(2,1,3,4,5));
		 */
		
		
		Integer[] num1 = {9, 1, 2, 5, 8, 3};
		
		List<Integer> iList = Arrays.asList(num1);
		System.out.println(iList.indexOf(Collections.max(iList)));
		
	}

	public static String checkPrime(int... nums) {
		String result = "";
		for (int i = 0; i < nums.length; i++) {
			boolean flag = true;
			for (int j = 2; j <= nums[i]; j++) {
				if (nums[i] % j == 0 && nums[i]!=j)
					flag = false;
			}
			if (flag)
				result = result + nums[i];
		}
		return result;
	}
}
