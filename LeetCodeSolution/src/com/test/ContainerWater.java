package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ContainerWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
		
	}
	
	public static int maxArea(int[] height) {
        //System.out.println(Arrays.stream(height).max().getAsInt());
		int maxArea = 0;
		int aIndex = 0;
		int bIndex = height.length-1;
		
		while(aIndex<bIndex) {
			if(height[aIndex]<height[bIndex]) {
				maxArea = Math.max(maxArea, height[aIndex]*(bIndex-aIndex));
				aIndex++;
			}else {
				maxArea = Math.max(maxArea, height[bIndex]*(bIndex-aIndex));
				bIndex--;
			}
				
		}
		
		
		/*
		 * List<Integer> areaList = new ArrayList<Integer>(); int startIndex =
		 * IntStream.range(0, height.length).filter(i ->
		 * Arrays.stream(height).max().getAsInt() == height[i]).findFirst().getAsInt();
		 * //index of max element for(int i=startIndex+1;i<height.length;i++) {
		 * areaList.add(height[i]*(i-startIndex)); } return Collections.max(areaList);
		 */
		return maxArea;
    }

}
