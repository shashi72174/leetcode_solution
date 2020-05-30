package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubstringWithConcatenationOfAllWords {

	public static void main(String[] args) {
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word","good","best","word"};
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	
	
	/*
	 * public static List<Integer> findSubstring(String s, String[] words) { int
	 * i=0; List<Integer> list = new ArrayList<Integer>(); list.add(1); list.add(2);
	 * list.add(3); list.add(4); list.add(5); list.remove(list.size()-(2-1));
	 * System.out.println(list); //Map<String> while(i<s.length()) {
	 * 
	 * } return null; }
	 */
	
	public static int[] plusOne(int[] digits) {
        String number = "";
        for(int i=0;i<digits.length;i++) {
        	number = number+digits[i];
        }
        int val = Integer.parseInt(number);
        String result = String.valueOf(val+1);
        int[] arr = new int[result.length()];
        for(int i=0;i<result.length();i++) {
        	arr[i]=Character.getNumericValue(result.charAt(i));
        }
        
        return arr;
    }

}
