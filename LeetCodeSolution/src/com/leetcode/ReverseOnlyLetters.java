package com.leetcode;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}
	
	public static String reverseOnlyLetters(String S) {
		int i=0;
		int j = S.length()-1;
		String lStr = "";
		String rStr = "";
		if(S.length()==0)
			return "";
		while(i<=j) {
			if(Character.isAlphabetic(S.charAt(i))) {
				if(Character.isAlphabetic(S.charAt(j)) && i!=j) {
					rStr = S.charAt(i)+rStr;
					lStr = lStr+S.charAt(j);
					i++;
					j--;
				}else {
					rStr = S.charAt(j)+rStr;
					j--;
				}
			}else {
				lStr = lStr+S.charAt(i);
				i++;
			}
		}
		return lStr+rStr;
    }
}