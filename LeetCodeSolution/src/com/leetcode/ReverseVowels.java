package com.leetcode;

public class ReverseVowels {

	public static void main(String[] args) {
		String s = "Marge, let's \\\"went.\\\" I await news telegram.";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		String lstr = "";
		String rstr = "";
		String vowels = "aeiouAEIOU";
		int center = s.length() / 2;
		String left = "", right = "", ctr = null;
		if (s.length() % 2 == 0) {
			left = s.substring(0, center);
			right = s.substring(center);
		} else {
			left = s.substring(0, center);
			ctr = "" + s.charAt(center);
			right = s.substring(center + 1);
		}
		int i = 0, j = right.length() - 1;
		boolean flag = false;
		while (i < left.length()) {
			flag=false;
			if (vowels.contains("" + left.charAt(i))) {
				while (j >= 0) {
					if (vowels.contains("" + right.charAt(j))) {
						rstr = left.charAt(i) + rstr;
						lstr = lstr + right.charAt(j);
						j--;
						flag = true;
						break;
					} else {
						rstr = right.charAt(j) + rstr;
						j--;
					}
				}
				if(!flag) {
					lstr = lstr + s.charAt(i);
					flag = false;
				}
			} else
				lstr = lstr + left.charAt(i);
			i++;
			if (i == left.length()) {
				while (j >= 0) {
					if (vowels.contains("" + right.charAt(j)))
						rstr = right.charAt(j) + rstr;
					else
						rstr = right.charAt(j) + rstr;
					j--;
				}
			}
		}
		if (ctr != null)
			return lstr + ctr + rstr;
		return lstr + rstr;
	}
}