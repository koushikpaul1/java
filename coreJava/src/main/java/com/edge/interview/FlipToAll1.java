package com.edge.interview;

import java.util.Scanner;
/**
 * @author edge
 *Given a string of bits and a number k. In one flip, you can toggle k consecutive characters, how many flips are required to change the entire string to all ones. For example
		Input String: 0000110000
		k: 3
		OUTPUT: 4
		Following are the four flips:
		
		FLIP-1: 1110110000
		FLIP-2: 1110110111
		FLIP-3: 1111000111
		FLIP-4: 1111111111
		If it is not possible to set all bits in the string then return -1. For example:
		
		Input String: 01010101
		k: 3
		OUTPUT: -1
 */
public class FlipToAll1
{
   public static int countFlips(char[] str, int k)
   {
      int flips = 0, i=0;
      int n = str.length-k;
      for(; i<=n; i++)
      {
         if(str[i] == '0')
         {
            // FLIP next k bits
            for(int j=0; j<k; j++)
               str[j+i] = (str[j+i] == '0') ? '1':'0';
            flips++;
         }
      }
      for(; i<str.length; i++)
         if(str[i] == '0')
            return -1;
      return flips;
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int k = sc.nextInt();
      int flips = countFlips(str.toCharArray(), k);
      if(flips == -1)
         System.out.println("Not possible to convert string");
      else
         System.out.println("String can be changed in "+ flips + " flips");
   }
}