package com.edge.collection.D_list.B_ldoublyLinkedList;

//import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee(1, "Jane", "Jones");
		Employee johnDoe = new Employee(2, "John", "Doe");
		Employee marySmith = new Employee(3, "Mary", "Smith");
		Employee mikeWilson = new Employee(4, "Mike", "Wilson");

		DoublyLinkedList list = new DoublyLinkedList();
		list.add(janeJones);
		list.add(johnDoe);
		list.add(marySmith);
		list.add(mikeWilson);
		System.out.println(list);

		EmployeeDoublyLinkedList empList = new EmployeeDoublyLinkedList();
		empList.add(janeJones);
		empList.add(johnDoe);
		empList.add(marySmith);
		empList.add(mikeWilson);

		empList.print();
		System.out.println();
		empList.printRev();
		System.out.println("\n" + empList.size());

		System.out.println("\n");
		empList.removeFromFront();
		empList.print();
		System.out.println();
		empList.printRev();
		System.out.println("\n" + empList.size());

		System.out.println("\n");
		empList.removeFromEnd();
		empList.print();
		System.out.println();
		empList.printRev();
		System.out.println("\n" + empList.size());

		System.out.println("\n");
		empList.addAtFront(mikeWilson);
		empList.print();
		System.out.println();
		empList.printRev();
		System.out.println("\n" + empList.size());
	}
}
