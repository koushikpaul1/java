package com.edge.test.db;

// Find out the top three numbers whos product is the highest, 

public class TopProduct {
	public static void main(String[] args){
		int first = 0;
		int second = 0;
		int third = 0;
		int[] input = { 1, 4, 7, 6, 9, 0,-400,-5 };
		//add a check the number of negative numbers can be zero or two.
		for(int num:input){
			if(num != 0 && num > third){
				if(num > second){
					if(num > first){
						third = second;
						second = first;
						first = num;
					}else{
						third = second;
						second = num;
					}
				}else{
					third = num;
				}
			}
		}
		//System.out.println(first +"  "+second +"  "+ third);
		System.out.println("Product of top three numbers is "+ first*second*third);
	}
}
