package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		String s = "ZZZ";
		System.out.println(titleToNumber(s));
	}

	public static int titleToNumber(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		loadAlphabets(map);
		if (s.length() == 1)
			return map.get(s.charAt(0));
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
				result = result * 26;
				result += s.charAt(i) - 'A' + 1; 
		}
		/*
		 * for (int i = s.length()-1; i >=0; i--) { for (int j = 1; j <=
		 * map.get(s.charAt(i)); j++) { for (int k = 1; k <= 26; k++) { result++; } } }
		 */

		return result;
	}

	private static void loadAlphabets(Map<Character, Integer> map) {
		int index = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			map.put(i, ++index);
		}
	}

}