/**
 * 
 */
package com.edge.interview;

import java.util.Scanner;

/**
 * @author edge
 *The rules of the FizzBuzz game are very simple.
	Say Fizz if the number is divisible by 3.
	Say Buzz if the number is divisible by 5.
	Say FizzBuzz if the number is divisible by both 3 and 5.
	Return the number itself, if the number is not divisible by 3 and 5.
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter Input");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String input = sc.nextLine();
		String [] datas=input.split(" ");
		for (String data:datas) {
			int num=Integer.parseInt(data);
			for (int i=1;i<=num;i++)
			{
				if((i%3)==0) {
				if((i%5)==0)System.out.println("FizzBuzz");
				else {System.out.println("Fizz");}
				}else {if((i%5)==0)System.out.println("Buzz");
				else {System.out.println(i);}
					
				}
			}
			System.out.println("\n\n");
		}

	}

}
