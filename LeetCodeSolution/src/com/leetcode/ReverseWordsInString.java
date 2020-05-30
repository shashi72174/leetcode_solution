package com.leetcode;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "a good   example";
		System.out.println(reverseWords(str));
	}
	
	public static String reverseWords(String s) {
		String finalString="";
		String[] str = s.trim().split(" ");
		for(int i=str.length-1;i>=0;i--) {
			if(str[i].length()>0)
				finalString = finalString+str[i]+" ";
		}
        return finalString.trim();
    }
}