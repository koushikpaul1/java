package com.edge.collection.D_list.A_linkedlist;

public class EmployeeLinkedList {
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void add(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		if(head == null){
			head = node;
			tail = node;
		}else{
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	public void addAtFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		if(head == null){
			head = node;
			tail = node;
		}else{
			node.setNext(head);
			head = node;
		}
		size++;
	}

	public void removeFromFront(){
		if(head == null){
			System.out.println("Empty List");
		}else{
			head = head.getNext();
		}
		size--;
	}

	public int size(){
		return size;
	}

	public void print(){
		EmployeeNode current = head;
		while (current != null){
			System.out.print(current);
			current = current.getNext();
			if(current != null) System.out.print(", ");
		}
	}
}

class EmployeeNode {
	private Employee employee;
	private EmployeeNode next;

	public EmployeeNode(Employee employee){
		super();
		this.employee = employee;
	}

	public Employee getEmployee(){
		return employee;
	}

	public void setEmployee(Employee employee){
		this.employee = employee;
	}

	public EmployeeNode getNext(){
		return next;
	}

	public void setNext(EmployeeNode next){
		this.next = next;
	}

	@Override
	public String toString(){
		return employee.toString();
	}
}
