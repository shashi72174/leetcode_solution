package com.leetcode;

public class Solution {
	
	public static void main(String[] args) {
		int dividend=-2147483648;
		int divisor=-1;
		System.out.println(divide(dividend,divisor));
	}
    public static int divide(int dividend, int divisor) {
        int result = (dividend)/(divisor);
		return result;
    }
}