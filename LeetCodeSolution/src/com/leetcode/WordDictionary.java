package com.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDictionary {

	Set<String> wordSet = null;

	/** Initialize your data structure here. */
	public WordDictionary() {
		wordSet = new HashSet<String>();
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		wordSet.add(word);
	}

	/**
	 * Returns if the word is in the data structure. A word could contain the dot
	 * character '.' to represent any one letter.
	 */
	public boolean search(String word) {
		boolean found = false;
		Iterator<String> itr = wordSet.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.length() == word.length()) {
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) != '.' && s.charAt(i) != word.charAt(i)) {
						found = false;
						break;
					} else
						found = true;
				}
			}
			if (found)
				break;
		}
		return found;
	}

	public static void main(String[] args) {
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("bad");
		wordDictionary.addWord("dad");
		wordDictionary.addWord("mad");
		System.out.println(wordDictionary.search("pad"));
		System.out.println(wordDictionary.search("b.."));
		System.out.println(wordDictionary.search("bad"));
		System.out.println(wordDictionary.search(".ad"));
		//Integer.parse
	}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary(); obj.addWord(word); boolean param_2
 * = obj.search(word);
 */
