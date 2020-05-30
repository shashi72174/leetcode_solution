package com.test;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = "";
        int n = sc.nextInt();
        sc.nextLine();
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<n;i++) {
        	String[] strArr = sc.nextLine().split(" ");
            int opType = Integer.parseInt(strArr[0]);
            if(opType==1) {
                s = s + strArr[1];
                stack.add(s);
            }else if(opType == 2 ) {
                s = s.substring(0,s.length()-Integer.parseInt(strArr[1]));
                stack.add(s);
            }else if(opType == 3 ) {
                System.out.println(""+s.charAt(Integer.parseInt(strArr[1])-1));
            }else {
            	stack.pop();
            	s = stack.lastElement();
            	
				/*
				 * list = list.subList(0, list.size()-1); if(list.size()!=0) s =
				 * list.get(list.size()-1); else s = "";
				 */
            }
        }
        sc.nextLine();
        sc.close();
	}

}
