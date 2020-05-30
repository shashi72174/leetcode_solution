package com.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aabb";
		System.out.println(frequencySort(s));
	}
	
	public static String frequencySort(String s) {
		if(s.length()==1)
			return s;
		String result = "";
		Map<Character,Integer> elementCount = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(elementCount.get(s.charAt(i))==null)
				elementCount.put(s.charAt(i), 1);
			else
				elementCount.put(s.charAt(i), elementCount.get(s.charAt(i)).intValue()+1);
		}
		Stream<Map.Entry<Character, Integer>> resultMap = elementCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		Iterator<Entry<Character, Integer>>  iterator = resultMap.iterator();
		while(iterator.hasNext()) {
			Entry<Character,Integer> newEntry = iterator.next();
			System.out.println(newEntry.getKey()+"\t"+newEntry.getValue());
		}
		/*
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue,
		 * newValue) -> oldValue, LinkedHashMap::new));
		 */
		
		
		/*
		 * for(Character c: resultMap.keySet()) { for(int i=0;i<resultMap.get(c);i++) {
		 * result = result+c; } }
		 */
		return result;
		
        
    }

}
