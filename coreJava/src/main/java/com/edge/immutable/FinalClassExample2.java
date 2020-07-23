package com.edge.immutable;

public class FinalClassExample2 {
	public static void main(String[] args){
		Age age = new Age(1, 1, 1992);
		MmutableStudent mmutablestudent = new MmutableStudent(1, "Alex", age);
		ImmutableStudent immutablestudent = new ImmutableStudent(1, "Alex", age);
		System.out.println("Alex age year before modification(mmutable) = " + mmutablestudent.getAge().getYear());
		System.out.println("Alex age year before modification(immutable) = " + immutablestudent.getAge().getYear());
		// age.setYear(1993);
		System.out.println("Alex age year after modification(mmutable) = " + mmutablestudent.getAge().getYear());
		System.out.println("Alex age year after modification(immutable) = " + immutablestudent.getAge().getYear());
	}
}

final class MmutableStudent {
	private final int id;
	private final String name;
	private final Age age;

	public MmutableStudent(int id,String name,Age age){
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public Age getAge(){
		return age;
	}
}

final class ImmutableStudent {
	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id,String name,Age age){
		this.name = name;
		this.id = id;
		Age copyAge = new Age(age.getDay(), age.getMonth(), age.getYear());
		this.age = copyAge;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public Age getAge(){
		return (Age) age.clone();
	}
}

class Age {
	private int day;
	private int month;
	private int year;

	public Age(){
		super();
	}

	public Age(int day,int month,int year){
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}
	// @Override
	/*
	 * public Age clone() throws CloneNotSupportedException { return
	 * (Age)super.clone(); }
	 */

	public Age clone(){
		Age temp = null;
		try{
			temp = (Age) super.clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return temp;
	}
}
