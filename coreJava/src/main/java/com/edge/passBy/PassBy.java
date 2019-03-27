package com.edge.passBy;



public class PassBy {
	 public static void main(String[] args)
	    {
	        int i = 5;
	        change(i);
	        System.out.println(i);//5
	        
	        Employee e=new Employee("Edge",30,200000,"Bangalore");
	        
	        change(e);
	        System.out.println(e);//Employee [name=Dimono, age=30, sal=200000.0, address=Bangalore]
	        Employee f=e;
	        change2(e);
	        System.out.println(e);//Employee [name=Pirate, age=30, sal=200000.0, address=Bangalore]
	        
	        
	        Employee x=new Employee("X",30,200000,"Bangalore");
	        Employee y=new Employee("Y",30,200000,"Bangalore");
	        
	        System.out.println("\n\n");
	        
	        System.out.println(x);//Employee [name=X, age=30, sal=200000.0, address=Bangalore]
	        System.out.println(y);//Employee [name=Y, age=30, sal=200000.0, address=Bangalore]
	        
	        swap(x,y);
	        
	        System.out.println(x);//Employee [name=X, age=30, sal=200000.0, address=Bangalore]
	        System.out.println(y);//Employee [name=Dimono, age=30, sal=200000.0, address=Bangalore]
	        
	        
	    }
	    public static void change(int x)
	    {
	        x = 10;
	    }
	    
	    public static void change(Employee  e)
	    {
	        Employee d=e;
	        d.setName("Dimono");
	        Employee f=new Employee();
	        f=e;
	        
	    }
	    public static void change2(Employee  e)
	    {	       
	        Employee f=new Employee();
	        System.out.println(f);//Employee [name=null, age=0, sal=0.0, address=null]
	        f=e;
	        System.out.println(f);//Employee [name=Dimono, age=30, sal=200000.0, address=Bangalore]
	        f.setName("Pirate");
	    }
	    public static void swap(Employee  x,Employee y) {
	    	Employee temp =x;
	    	x=y;
	    	change(x);
	    	y=temp;
	    	
	    }
}



