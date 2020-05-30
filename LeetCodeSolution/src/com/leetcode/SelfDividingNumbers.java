package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		int left = 1, right = 22;
		System.out.println(selfDividingNumbers(left, right));
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        boolean addFlag = false;
        for(int i=left;i<=right;i++) {
            String s = String.valueOf(i);
            for(int j=0;j<s.length();j++) {
            	int val = new Integer(""+s.charAt(j));
            	if(val!=0 && i%val==0)
            		addFlag = true;
            	else {
            		addFlag = false;
            		break;
            	}
            	
            }
            if(addFlag)
            	list.add(Integer.parseInt(s));
        }
        return list;
    }
}