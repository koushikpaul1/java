package com.edge.interview;

import java.util.Scanner;

public class First
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