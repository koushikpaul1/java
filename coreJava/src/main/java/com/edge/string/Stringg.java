package com.edge.string;

public class Stringg {

	public static void main (String [] args) {
		Stringg s=new Stringg();
		s.string();
		s.stringBuilder();
	}
	
	void string() {
		String a = new String("abc");
		String b = a+("de");
		b = b+("f")+("g");
		System.out.println("a=" + a);//abc
		System.out.println("b=" + b);//abcdefg	
		String c = "abcdefg";
		String d = "abcdefg";
		String e = new String("abcdefg");
		System.out.println("c=" + c);//abcdefg
		System.out.println(a.equals(b));//false
		System.out.println(a==b);//false
		System.out.println(c.equals(b));//true
		System.out.println(b==c);//false
		System.out.println(d==c);//true
		System.out.println(b==e);//false
		System.out.println(b.equals(e));//false
		a=b;
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true
		System.out.println("\n");
		
		
		
		/*String aa="x";
		String bb="x";
		String cc=new String("x");		
		StringBuilder dd=new StringBuilder().append("x");
		StringBuilder ee=new StringBuilder().append("x");
		System.out.println(aa==bb );
		System.out.println(cc==bb );
		System.out.println(aa.equals(bb) );
		System.out.println(aa.equals(cc) );
		System.out.println(dd==ee );
		System.out.println(dd.equals(ee) );
		System.out.println("\n");*/
	}
	void stringBuilder() {
		StringBuilder a = new StringBuilder("abc");
		StringBuilder c = new StringBuilder();
		StringBuilder b =c= a.append("de");
		b = b.append("f").append("g");
		StringBuilder d = new StringBuilder("abcdefg");
		System.out.println("a=" + a);//abcdefg
		System.out.println("b=" + b);//abcdefg
		System.out.println("c=" + c);//abcdefg
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true
		System.out.println(a==c);//true
		System.out.println(a.equals(d));//false
	}
}
