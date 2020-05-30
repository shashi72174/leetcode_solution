package com.leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "race a car";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String s) {
		String a = "";
		if(s.equals(""))
			return true;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i)))
				a = a + s.charAt(i);
			else if (Character.isDigit(s.charAt(i)))
				a = a + s.charAt(i);
		}
		StringBuilder sb = new StringBuilder(a);
		return a.equalsIgnoreCase(sb.reverse().toString());
	}

}
