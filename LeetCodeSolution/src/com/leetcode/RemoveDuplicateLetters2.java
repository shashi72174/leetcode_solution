package com.leetcode;

public class RemoveDuplicateLetters2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbcaac";
		System.out.println(removeDuplicateLetters(s));
	}
	
	public static String removeDuplicateLetters(String s) {
		if(s.length()==1 || s.length()==0)
        	return s;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(sb.length()==0)
				sb.append(s.charAt(i));
			else {
				if(sb.charAt(i-1)<s.charAt(i))
					sb.append(s.charAt(i));
				else {
					if(s.indexOf(sb.charAt(i-1))>i) {
						sb.deleteCharAt(i-1);
						sb.append(s.charAt(i));
					}
				}
			}
		}
		return sb.toString();
	}

}
