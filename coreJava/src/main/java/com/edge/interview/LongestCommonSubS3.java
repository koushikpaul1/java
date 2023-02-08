package com.edge.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class LongestCommonSubS3 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(lCSubstr(line));
    }
  }
  
  public static String lCSubstr(String input){
    String str1=input.split(";")[0];
    String str2=input.split(";")[1];
   
    return (lCSubstr(str1,str2).length()> lCSubstr(str2,str1).length()) ? lCSubstr(str1,str2):lCSubstr(str2,str1);
  } 
  
  public static String lCSubstr(String str1,String str2){
	  StringBuilder sub1=new StringBuilder();
	    for (int i=0;i<str1.length();i++){
	      StringBuilder sub2=new StringBuilder();
	      int k=0;
	      for (int j=0;j<str2.length() & (i + k) < str1.length();j++){
	        if (str1.charAt(i+k)==str2.charAt(j)){
	          sub2.append(str2.charAt(j));
	          k++;
	        }//else if (k > 0 & str1.charAt(i + k) != str2.charAt(j))break;
	      }if (sub2.length()>sub1.length())sub1=sub2;
	    }   
	    return sub1.toString();
	  } 
  
  
}
