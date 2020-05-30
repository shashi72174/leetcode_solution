package com.leetcode;

public class ConstantsCount {
	
	public static void main(String[] args) {
		int vowel=0;
		String str1 ="AEIOU";
		String str = "DEEPIKA";
		for(int i=0;i<str.length();i++){
			if(str1.contains(String.valueOf(str.charAt(i))))
				vowel++;	
		}
		System.out.println("consonents "+(str.length()-vowel));
		System.out.println("vowel "+vowel);
	}
}
