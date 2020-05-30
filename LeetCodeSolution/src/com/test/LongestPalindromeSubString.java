package com.test;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbbd"; //forgeeksskeegfor
		System.out.println(longestPalindrome(s));
	}
		
	public static String longestPalindrome(String s) {
		if(s.equals(new StringBuffer(s).reverse().toString()))
			return s;
		String palindromeString = "";
		int middle = s.length()/2;
		int j = middle;
		int i = 1;
		int k = middle+1;
		palindromeString = palindromeString + s.charAt(middle);
		j = j-i;
		while(j>=0) {
			if(s.charAt(j)==s.charAt(k)) {
				palindromeString = s.charAt(j) + palindromeString + s.charAt(k);
				j--;
				k++;
			}else if(j == (middle-1) && s.charAt(j) == s.charAt(middle)) {
				palindromeString = palindromeString + s.charAt(j);
				j--;
			}else if(k == (middle+1) && s.charAt(k) == s.charAt(middle)) {
				palindromeString = palindromeString + s.charAt(k);
				k++;
			}else {
				break;
			}
		}
		return palindromeString;
    }

}
