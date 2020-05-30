package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestWordInDictionaryByDeleting {
	public static void main(String[] args) {
		//String s = "abpcplea";		//String s = "geeksforgeeks";
		String s = "aewfafwafjlwajflwajflwafj";
		List<String> list = new ArrayList<String>();		//list.add("monkey");		//list.add("ale");list.add("apple");list.add("monkey");list.add("plea");		//list.add("pintu");list.add("geeksfor");list.add("geeksgeeks");list.add("forgeek");
		list.add("apple");list.add("ewaf");list.add("awefawfwaf");list.add("awef");list.add("awefe");list.add("ewafeffewafewf");
		System.out.println(findLongestWord(s, list));
	}
	
	public static String findLongestWord(String s, List<String> d) {
		String longestString = "";
		if(d.size()==0)
			return longestString;
		Collections.sort(d);
		for(String word : d) {
			String originalStr = s;
			int i=0,j=0;
			boolean flag = true;
			StringBuilder sb = new StringBuilder(s);
			while(i<word.length()) {
				while(j<sb.length()) {
					if(sb.charAt(j)!=word.charAt(i))
						sb.deleteCharAt(j);
					else {
						j++;
						break;
					}
				}
				i++;
			}
			if(sb.length()<word.length()) 
				flag = false;
			else if(sb.length()>=word.length() && sb.substring(0,word.length()).toString().equals(word))
				longestString = (longestString.length()<word.length() && flag) ? word : longestString;
			s = originalStr;
		}
		return longestString;
    }
}