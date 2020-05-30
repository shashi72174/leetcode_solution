package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xaxbbbxx";
		System.out.println(anagram(s));
	}
	
	 public static int anagram(String s) {
		 Map<Character,Integer> mapA = new HashMap<Character,Integer>();
 		 Map<Character,Integer> mapB = new HashMap<Character,Integer>();
		 int charChange = 0;
		 if(s.length()%2==1)
			 return -1;
		 else {
			 String s1 = s.substring(0, s.length()/2);
			 String s2 = s.substring(s.length()/2);
			 
			 for(int i=0;i<s1.length();i++) {
				 if(mapA.get(s1.charAt(i))==null)
					 mapA.put(s1.charAt(i), 1);
				 else
					 mapA.put(s1.charAt(i), mapA.get(s1.charAt(i))+1);
			 }
			 
			 for(int i=0;i<s2.length();i++) {
				 if(mapB.get(s2.charAt(i))==null)
					 mapB.put(s2.charAt(i), 1);
				 else
					 mapB.put(s2.charAt(i), mapB.get(s2.charAt(i))+1);
			 }
			 
			 for(Character c : mapA.keySet()) {
				 if(!mapB.containsKey(c))
					 charChange = charChange+mapA.get(c);
				 else if(mapB.containsKey(c)) {
					 if(mapA.get(c)>mapB.get(c))
						 charChange = charChange+Math.abs(mapB.get(c)-mapA.get(c));
				 }
			 }
		 }
		 return charChange;
		 
	 }

}
