package com.edge.test.oracle;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Result r =new Result();
		//List list=new 
		//r.minX(ar);
		System.out.println(r.countPerms(4));
		 List <String> list=new LinkedList ();
		 list.add("Steven XL");
		 list.add("Steven XVI");
		 list.add("Steven IX");
		 list.add("Mary XV");
		 list.add("Mary XL");
		 list.add("Mary XL");
		 list.add("Mary XL");
		 list.add("Jane XL");
		 list.add("Jane XL");
		 list.add("Jane XXL");
		 list.add("Jane XLIII");
		 list=r.sortRoman(list);
		 for(String s:list)System.out.println(s);
	}

}
