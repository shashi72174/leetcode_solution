package com.leetcode;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String str = "{[]}";
		System.out.println(isValid(str));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') 
				stack.push(s.charAt(i));
			else if(s.charAt(i)=='{') 
				stack.push(s.charAt(i));
        	else if(s.charAt(i)=='[')
				stack.push(s.charAt(i));
        	else if(s.charAt(i)==')') {
        		if(!stack.isEmpty()) {
        			if(stack.peek()!='(')
        				return false;
        			else
        				stack.pop();
        		}else
        			return false;
        	}else if(s.charAt(i)=='}') {
        		if(!stack.isEmpty()) {
        			if(stack.peek()!='{')
        				return false;
        			else
        				stack.pop();
        		}else
        			return false;
        	}else if(s.charAt(i)==']') {
        		if(!stack.isEmpty()) {
        			if(stack.peek()!='[')
        				return false;
        			else
        				stack.pop();
        		}else
        			return false;
        	}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
}