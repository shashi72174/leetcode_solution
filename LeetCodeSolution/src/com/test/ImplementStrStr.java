package com.test;

public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "aaaaa";
		String needle = "bba";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
        if(needle.equals(""))
        	return 0;
        return haystack.indexOf(needle);
    }
}
