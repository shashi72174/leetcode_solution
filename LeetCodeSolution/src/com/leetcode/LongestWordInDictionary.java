package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestWordInDictionary {

	public static void main(String[] args) {
		//String[] words = {"w","wo","wor","worl", "world"};
		//String[] words = {"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
		//String[] words = {"k","lg","it","oidd","oid","oiddm","kfk","y","mw","kf","l","o","mwaqz","oi","ych","m","mwa"};
		//String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		String[] words = {"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
		System.out.println(longestWord(words));
	}
	
	public static String longestWord(String[] words) {
		Arrays.sort(words);	
		String result = "";
		List<String> prevList = new ArrayList<String>(); 
		for(int i=0;i<words.length;i++) {
			if(words[i].length()==1 || prevList.contains(words[i].substring(0, words[i].length()-1))) {
				if(words[i].length()>result.length()) {
					result = words[i];
				}
				prevList.add(words[i]);
			}
			
		}
		return result;
    }
}
