package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,8,16,32,64,128,256,512};
		//int[] arr = {12,128};
		//int[] arr = {10,2};
		//int[] arr = {3,30,34,5,9};
		List<String> list = new ArrayList<String>();
		Arrays.stream(arr).forEach(i -> list.add(""+i));
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				System.out.println(s1+"\t"+s2);
				if(new Integer(""+s1.charAt(0))>new Integer(""+s2.charAt(0)))
					return -1;
				else if(new Integer(""+s1.charAt(0))<new Integer(""+s2.charAt(0)))
					return 1;
				else if(new Integer(""+s1.charAt(0)).intValue()==new Integer(""+s2.charAt(0)).intValue()) {
					if(s1.length()==1) {
						if(s2.length()>1 && new Integer(""+s2.charAt(1))==0)
							return -1;
						else if(s2.length()>1 && new Integer(""+s2.charAt(1))!=0)
							return 1;
					}else if(s2.length()==1) {
						if(s1.length()>1 && new Integer(""+s1.charAt(1))==0)
							return 1;
						else if(s1.length()>1 && new Integer(""+s1.charAt(1))!=0)
							return -1;
					}else if(s1.length()>1 && s2.length()>1) {
						if(s1.length()>s2.length()) {
							if(new Integer(""+s1.charAt(s1.length()-1))==1 || new Integer(""+s1.charAt(s1.length()-1))==0)
								return 1;
							else
								return -1;
						}else if(s1.length()<s2.length()){
							if(new Integer(""+s2.charAt(s2.length()-1))==1 || new Integer(""+s2.charAt(s2.length()-1))==0)
								return -1;
							else
								return 1;
						}else {
							if (new Integer(s1).intValue() > new Integer(s2).intValue())
								return -1;
							else if (new Integer(s1).intValue() < new Integer(s2).intValue())
								return 1;
						}
						 
						
					}
				}
					
				return 0;
			}
		});
		System.out.println(list.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
	}

}
