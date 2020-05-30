package com.leetcode;

public class FibanocciMemoization {

	public static void main(String[] args) {
		int N = 5;
		Integer[] memoizationArr = new Integer[N+1];
		memoizationArr[0]=0;
		System.out.println(fib(N,memoizationArr));
	}
	
	
	public static int fib(int N,Integer[] memoizationArr) {
		int result=0;
		if(memoizationArr[N]!=null)
			return memoizationArr[N];
        if(N==0) {
        	memoizationArr[N]=0;
            return 0;
        }
        if(N==1 || N==2) {
        	memoizationArr[N]=1;
        	return 1;
        }else 
        	result = fib(N-1,memoizationArr)+fib(N-2,memoizationArr);
        
        memoizationArr[N]=result;
        return memoizationArr[N];
    }
}