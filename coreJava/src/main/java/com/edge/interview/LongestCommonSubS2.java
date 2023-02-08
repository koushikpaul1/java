package com.edge.interview;

public class LongestCommonSubS2 {

	public static void main(String[] args) {
		//String str1 = "Koushikpaul";
	//	String str2 = "asdfgoushqwertikpauzxcv";	
		
		String str1 = "gfdg1ghgh2ghghy345qwd6yu789z0gju";
		String str2 = "um1p2o3i4u5y6t7v89nmki0lp";	
		System.out.println(longestCommonSubstring(str1,str2));
	}
	public static String longestCommonSubstring(String s1, String s2) {
	    int[][] dp = new int[s1.length() + 1][s2.length() + 1];
	    int maxLength = 0;
	    int endIndex = 0;
	    for (int i = 1; i <= s1.length(); i++) {
	        for (int j = 1; j <= s2.length(); j++) {
	            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                dp[i][j] = dp[i - 1][j - 1] + 1;
	                if (dp[i][j] > maxLength) {
	                    maxLength = dp[i][j];
	                    endIndex = i;
	                }
	            }
	        }
	    }
	    return s1.substring(endIndex - maxLength, endIndex);
	}
}