package com.edge.test.synechron;

public class Main {
	public static void main(String[] args){

		String  s= "abcccbkdd";
		int [] a= {0,1,2,3,0,1,4,5,6,7,8,9,0};
		System.out.println(new Solution().solution(s, a));
		System.out.println(new Solution().solution(a));
	}
}
