package com.edge.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class FinalClassExample {
	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	/**
	 * Accessor function for mutable objects
	 */
	public HashMap<String, String> getTestMap(){
		// return testMap;
		return (HashMap<String, String>) testMap.clone();// accessor method returning clone,preventing object
															// modification.
	}

	/**
	 * Constructor performing Deep Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	public FinalClassExample(int i,String n,HashMap<String, String> hm){
		System.out.println("Performing Deep Copy for Object initialization");
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()){
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}
	/**
	 * Constructor performing Shallow Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */

	/*
	 * public FinalClassExample(int i,String n, HashMap<String,String> hm){
	 * System.out.println("Performing Shallow Copy for Object initialization");
	 * this.id=i; this.name=n; this.testMap=hm; }
	 */
	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy
	 * for creating immutable classes
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "first");
		hMap.put("2", "second");
		String name = "original";
		int i = 10;
		FinalClassExample ce = new FinalClassExample(i, name, hMap);
		// Lets see whether its copy by field or reference
		System.out.println(name == ce.getName());// true
		System.out.println(hMap == ce.getTestMap());// false
		// print the ce values
		System.out.println("ce id:" + ce.getId());// ce id:10
		System.out.println("ce name:" + ce.getName());// ce name:original
		System.out.println("ce testMap:" + ce.getTestMap());// ce testMap:{1=first, 2=second}
		// change the local variable values
		i = 20;
		name = "modified";
		hMap.put("3", "third");
		// print the values again
		System.out.println("ce id after local variable change:" + ce.getId());// 10
		System.out.println("ce name after local variable change:" + ce.getName());// original
		System.out.println("ce testMap after local variable change:" + ce.getTestMap());// {1=first, 2=second}
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "fourth");
		System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTestMap());// {1=first,
																											// 2=second}
	}
}