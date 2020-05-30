package com.leetcode;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 50}};
		int target = 13;
		System.out.println(searchMatrix(matrix, target));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		boolean isPointerInThatRow = false;
		for(int i=0;i<matrix.length;i++) {
			if(isPointerInThatRow)
				break;
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]<=target && matrix[i][matrix[i].length-1]>=target) {
					isPointerInThatRow = true;
					if(matrix[i][j]==target)
						return true;
				}else 
					break;
			}
		}
        return false;
    }
}