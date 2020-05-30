package com.leetcode;

public class ReverseString2 {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, k));
	}
	
	public static String reverseStr(String s, int k) {
		StringBuilder sb = new StringBuilder("");
		String reverseStr = "";
		String subStr = "";
		if(s.length()<k) {
			reverseStr = sb.append(s.substring(0,s.length())).reverse().toString();
			return reverseStr;
		}
		while(s.length()>0) {
			sb = new StringBuilder("");
			if(s.length()<k) {
				reverseStr = reverseStr + sb.append(s.substring(0,s.length())).reverse().toString();
				s = "";
			}else if(s.length()<(2*k) && s.length()>=k) { 
				subStr = s.substring(0, s.length());
				reverseStr = reverseStr+sb.append(subStr.substring(0, k)).reverse().toString();
				reverseStr = reverseStr + subStr.substring(k);
				s = "";
			}else {
				subStr = s.substring(0,2*k);
				reverseStr = reverseStr+sb.append(subStr.substring(0, k)).reverse().toString();
				reverseStr = reverseStr + subStr.substring(k);
				s = s.substring(subStr.length());
			}
		}
        return reverseStr;
    }
}