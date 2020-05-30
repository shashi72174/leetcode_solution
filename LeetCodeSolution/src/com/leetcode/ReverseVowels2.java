package com.leetcode;

public class ReverseVowels2 {

	public static void main(String[] args) {
		String s = "a.b,.";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		String lstr = "";
		String rstr = "";
		String vowels = "aeiouAEIOU";
		int i=0;
		int j=s.length()-1;
		boolean flag = false;
		while(i<j) {
			if(vowels.contains(""+s.charAt(i))) {
				while(j>i) {
					if(vowels.contains(""+s.charAt(j))) {
						rstr = s.charAt(i) + rstr;
						lstr = lstr + s.charAt(j);
						j--;
						flag = true;
						break;
					}else
						rstr = s.charAt(j) + rstr;
					j--;
				}
				if(!flag)
					lstr = lstr + s.charAt(i);
					
			}else 
				lstr = lstr + s.charAt(i);
			i++;
		}
		if(s.length()%2!=0)
			return lstr+s.charAt(i)+rstr;
		return lstr+rstr;
	}
}