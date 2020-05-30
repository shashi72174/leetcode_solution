package com.leetcode;

import java.util.Arrays;

public class ReverseStringInPlace {
	//should not use/introduce new variable, we should modify existing variable to reverse string.
	public static void main(String[] args) {
		String s = "Hannah";
		reverseString(s.toCharArray());
	}

	public static void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;
		while(i<j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(s));

	}
}