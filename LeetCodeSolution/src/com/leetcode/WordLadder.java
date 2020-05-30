package com.leetcode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
	public static void main(String[] args) {
		String beginWord = "hot";
		String endWord = "dog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");wordList.add("cog");wordList.add("dog");wordList.add("tot");wordList.add("hog");wordList.add("hop");wordList.add("pot");wordList.add("dot");
		System.out.println(new WordLadder().ladderLength(beginWord, endWord, wordList));
	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Hashtable<String, Boolean> visited = new Hashtable<String,Boolean>();
		if(!wordList.contains(endWord))
			return 0;
		Queue<String> queue = new LinkedList<String>();
		queue.offer(beginWord);
		visited.put(beginWord, true);
		int level=1;
		while(!queue.isEmpty()) {
			String nextWord = findOneLetterWordChangeFromWordList(queue.poll(),wordList,visited);
			if(nextWord!=null && nextWord.equals(endWord))
				return ++level;
			else {
				if(nextWord!=null) {
					visited.put(nextWord, true);
					queue.offer(nextWord);
				}
				else
					break;
			}
			level++;
		}
		return 0;
	}
	
	private String findOneLetterWordChangeFromWordList(String beginWord, List<String> wordList,Hashtable<String, Boolean> visited) {
		String word = null;
		for(int i= 0;i<wordList.size();i++) {
			if(oneLetterDiff(beginWord,wordList.get(i))) {
				if(visited.get(wordList.get(i))==null)
					word = wordList.get(i);
			}
		}
		return word;
	}
	
	private boolean oneLetterDiff(String beginWord, String word) {
		int singleLetterChange = 0;
		for(int i=0;i<beginWord.length();i++) {
			if(beginWord.charAt(i)!=word.charAt(i)) 
				singleLetterChange++; 
		}
		return singleLetterChange==1 ? true : false;
	}
}