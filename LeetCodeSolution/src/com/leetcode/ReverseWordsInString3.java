package com.leetcode;

public class ReverseWordsInString3 {

	public static void main(String[] args) {
		String str = "Let's take LeetCode contest";
		System.out.println(reverseWords(str));
	}
	
	public static String reverseWords(String s) {
		String reverseStr = "";
		if(s.length()==0)
			return s;
		String[] splitArr = s.split(" ");
		for(int i=0;i<splitArr.length;i++) {
			for(int j=splitArr[i].length()-1;j>=0;j--) {
				reverseStr = reverseStr + splitArr[i].charAt(j);
			}
			reverseStr = reverseStr + " ";
		}
		return reverseStr.trim();
		
    }
}