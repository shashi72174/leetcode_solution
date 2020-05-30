package com.test;

public class BinarySubArraysSum {

	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1};
		int sum = 2;
		System.out.println(numSubarraysWithSum(arr, sum));
	}
	
	public static int numSubarraysWithSum(int[] A, int S) {
		int result = 0;
		int sum = 0;
		if(A.length==1) {
			if(A[0]!=S)
				return result;
			return ++result;
		}else {
			for(int i=0;i<A.length;i++) {
				sum = A[i];
				if(A[i]==S)
					result++;
				for(int j=i+1;j<A.length;j++) {
					sum = sum + A[j];
					if(sum==S)
						result++;
				}
				sum=0;
			}
		}
        return  result;
    }
}