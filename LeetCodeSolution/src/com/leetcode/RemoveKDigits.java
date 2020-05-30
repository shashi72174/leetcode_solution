package com.leetcode;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		String num = "10200";
		int k = 2;
		System.out.println(removeKdigits(num, k));
	}
	
	public static String removeKdigits(String num, int k) {
        String result = "";
        if(num.length()==0 || num.length()==k)
        	return "0";
        
        Stack<Character> stack = new Stack<Character>();
        int i=0;
        while(i<num.length()) {
        	while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)) {
            	stack.pop();
            	k--;
            }
        	stack.push(num.charAt(i));
        	i++;
        }
        while(k>0) {
        	stack.pop();
        	k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());        	
        }
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0)=='0') {
        	sb.deleteCharAt(0);
        }
        result = sb.toString();
        return result;
    }

}
