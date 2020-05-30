package com.leetcode;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6}};
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(transpose(matrix)));
	}
	
	public static int[][] transpose(int[][] A) {
		
		int[][] transposeMatrix=new int[A[0].length][A.length];
		
		for(int j=0;j<A.length;j++) {
				int i=0;
				while(i<A[j].length) {
					transposeMatrix[i][j] = A[j][i];
					i++;
				}
		}
		
		return transposeMatrix;
    }

}
