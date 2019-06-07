package com.testing.srting;

public class SinglyLinkedlist{
	
	Node head;
	
	public SinglyLinkedlist() {
		head= new Node();
		head.value=0;
		head.next=null;
	}
	class Node{
		int value;
		Node next;
	}

	
	public boolean add(int value) {
		
		Node n= new Node();
		n.value=value;
		n.next=null;
		Node n1= head;
		while(n1.next!=null) {
			n1=n1.next;
		}
		n1.next=n;
		return true;
	}
	
	public void printAll() {
		Node n= head;
		while(n!=null) {
			if(n.value!=0) {
			System.out.println(n.value);
			}
			n= n.next;
		}
	}
	
	
	public Node reverse(){
		Node current = head;
		Node prev = null;
		Node next= null;
		
		while(current!=null) {
			System.out.println("in");
			next= current.next;
			current.next= prev;
			prev=current;
			current= next;
		}
		head= prev;
	
		return head;
		
		
	}
}
