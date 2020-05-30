package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		//String s = "ABBB";
		String s = "ABAB";
		int k = 2;
		System.out.println(characterReplacement(s, k));
	}

	public static int characterReplacement(String s, int k) {
		int result = 0;
		if(testStringForAllSingleChars(s))
			return s.length();
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder(s);
			int op = k;
			int start = i;
			int end = start + 1;
			while (start < sb.length() - 1) {
				if (sb.charAt(start) == sb.charAt(end)) {
					start++;
					end++;
					if (end == sb.length()) {
						if (result < sb.substring(i, end).length())
							result = sb.substring(i, end).length();
					}
				} else {
					if (op > 0) {
						sb.setCharAt(sb.charAt(end+1)!=sb.charAt(start)?start:end, sb.charAt(end+1)==sb.charAt(start)?sb.charAt(start):sb.charAt(end));
						op--;
						start++;
						end++;
					} else {
						int len = sb.substring(i, end).length();
						if (len > result)
							result = len;
						break;
					}
				}
			}
			if (result == 0)
				result = sb.substring(i, end).length();

		}
		return result;
	}

	private static boolean testStringForAllSingleChars(String A) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (int i = 0; i < A.length(); i++) {
			if (charCount.get(A.charAt(i)) == null)
				charCount.put(A.charAt(i), 1);
			else {
				int val = (charCount.get(A.charAt(i))).intValue();
				charCount.put(A.charAt(i), ++val);
			}
		}
		return charCount.size()==1?true:false;
	}
}