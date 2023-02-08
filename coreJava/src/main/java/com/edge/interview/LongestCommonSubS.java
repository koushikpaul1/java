package com.edge.interview;

import java.io.IOException;

public class LongestCommonSubS {
	public static void main(String[] args) throws IOException {
		String str1 = "Koushikpaul";
		String str2 = "asdfgoushqwertikpauzxcv";
		StringBuilder sub1 = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			StringBuilder sub2 = new StringBuilder();
			int k = 0;
			for (int j = 0; j < str2.length() ; j++) {
				if (str1.charAt(i + k) == str2.charAt(j)) {
					sub2.append(str2.charAt(j));
					k++;
				} else if (k > 0 & str1.charAt(i + k) != str2.charAt(j))break;
			}
			if (sub2.length() > sub1.length())sub1 = sub2;
		}
		System.out.println(sub1);
	}
}

