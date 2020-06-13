package com.edge.collection.D_list.B_ldoublyLinkedList;

public class EmployeeDoublyLinkedList {
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void add(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
		}
		size++;
	}

	public void addAtFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
		size++;
	}

	public void removeFromFront() {
		if (head == null) {
			System.out.println("Empty List");
		} else if (head.getNext() == null) {
			head = null;
			tail = null;
		} else {
			head = head.getNext();
			head.setPrev(null);
			size--;
		}

	}

	public void removeFromEnd() {
		if (head == null) {
			System.out.println("Empty List");
		} else if (tail.getPrev() == null) {
			head = null;
			tail = null;
		} else {
			tail = tail.getPrev();
			tail.setNext(null);
			size--;
		}

	}

	public int size() {
		return size;
	}

	public void print() {
		EmployeeNode current = head;
		while (current != null) {
			System.out.print(current);
			current = current.getNext();
			if (current != null)
				System.out.print(", ");
		}
	}

	public void printRev() {
		EmployeeNode current = tail;
		while (current != null) {
			System.out.print(current);
			current = current.getPrev();
			if (current != null)
				System.out.print(", ");

		}
	}
}

class EmployeeNode {
	private EmployeeNode prev;
	private Employee employee;
	private EmployeeNode next;

	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeNode prev) {
		this.prev = prev;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}
}

