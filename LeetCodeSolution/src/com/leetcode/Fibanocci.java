package com.leetcode;

public class Fibanocci {

	public static void main(String[] args) {
		int N = 4;
		System.out.println(fib(N));
	}
	
	
	public static int fib(int N) {
        if(N==0)
            return 0;
        if(N==1)
        	return 1;
        int a=0;
        int b=1;
        int i=2;
        int c=0;
        while(i<=N) {
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}