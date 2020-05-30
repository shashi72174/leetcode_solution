package com.test;

import java.util.Stack;
import java.util.Scanner;

public class SimpleTextEditor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = "";
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for(int i=0;i<n;i++) {
            str[i] = sc.nextLine();
        }
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<str.length;i++) {
            String[] strArr = str[i].split(" ");
            int opType = Integer.parseInt(strArr[0]);
            if(opType==1) {
                s = s + strArr[1];
                stack.push(s);
            }else if(opType == 2 ) {
                s = s.substring(0,s.length()-Integer.parseInt(strArr[1]));
                stack.push(s);
            }else if(opType == 3 ) {
                System.out.println(""+s.charAt(Integer.parseInt(strArr[1])-1));
            }else {
            	stack.pop();
            	if(stack.size()!=0)
            		s = stack.lastElement();
            	else
            		s = "";
            }
        }
        sc.close();
	}

}
