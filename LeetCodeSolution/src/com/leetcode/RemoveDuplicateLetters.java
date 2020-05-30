package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		String s = "bbcaac";
		System.out.println(removeDuplicateLetters(s));
	}
	
	public static String removeDuplicateLetters(String s) {
        if(s.length()==1 || s.length()==0)
        	return s;
        String unique = "";
        for(int i=0;i<s.length();i++) {
        	if(!unique.contains(""+s.charAt(i)))
        		unique=unique + s.charAt(i);
        }
        final String uniqueFinal = unique;
        Set<String> list = new HashSet<String>();
        String str = "";
        for(int i=0;i<s.length();i++) {
        	str = str+s.charAt(i);
        	for(int j=i+1;j<s.length();j++) {
        		if(!str.contains(""+s.charAt(j))) {
        			str = str+s.charAt(j);
        			if(!list.contains(str)) {
        				list.add(str);
        			}else 
        				str = str.substring(0,1);
        		}
        	}
        	list.add(str);
        	str = "";
        }
        List<String> l1 = new ArrayList<String>(list);
        Collections.sort(l1);
        List<String> newList = l1.stream().filter(s1 -> s1.length()==uniqueFinal.length()).collect(Collectors.toList());
        Collections.sort(newList);
        System.out.println(newList);
        return newList.get(0);
    }
}