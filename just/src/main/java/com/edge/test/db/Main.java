package com.edge.test.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int num = Integer.parseInt(br.readLine());
		System.out.println(palindrom(name));
		System.out.println(fibonacci(num));
	}

	static boolean palindrom(String name){
		name = name.replaceAll("\\s", "");
		boolean flag = true;
		int len = name.length();
		for(int i = 0;i < len;i++)
			if(Character.toLowerCase(name.charAt(i)) != Character.toLowerCase(name.charAt(len-i-1))) flag = false;
		return flag;
	}

	static int fibonacci(int num){
		int result = 1;
		int before = 0;
		for(int i = 1;i <= num;i++){
			int temp = result;
			result = result + before;
			before = temp;
		}
		return before;
	}
}
