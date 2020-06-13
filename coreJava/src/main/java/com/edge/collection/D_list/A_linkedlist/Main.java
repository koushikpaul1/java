package com.edge.collection.D_list.A_linkedlist;

//import java.util.LinkedList;
public class Main {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		Employee janeJones = new Employee(1, "Jane", "Jones");
		Employee johnDoe = new Employee(2, "John", "Doe");
		Employee marySmith = new Employee(3, "Mary", "Smith");
		Employee mikeWilson = new Employee(4, "Mike", "Wilson");
		
		EmployeeLinkedList empList = new EmployeeLinkedList();
		empList.add(janeJones);
		empList.add(johnDoe);
		empList.add(marySmith);
		empList.add(mikeWilson);
		
		LinkedList list = new LinkedList();
		list.add(janeJones);		
		list.add(johnDoe);
		list.add(marySmith);
		System.out.println(list.length());
		list.add(mikeWilson);
		
		System.out.println(list);
		empList.print();
		System.out.println("\n" + empList.size());
		System.out.println("\n");
		empList.removeFromFront();
		empList.print();
		System.out.println("\n" + empList.size());
		System.out.println("\n");
		empList.addAtFront(mikeWilson);
		empList.print();
		System.out.println("\n" + empList.size());
	}
}
