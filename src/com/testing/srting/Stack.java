package com.testing.srting;

public class Stack 
{
	private Integer[] stack;
	private int top;
	private int size;
	
	public Stack() {
		top=-1;
		size=50;
		stack= new Integer[50];
	}
	
	public Stack(int size) {
		top=-1;
		this.size=size;
		stack= new Integer[this.size];
	}
	
	public boolean push(int value) {
		if(!isFull())
		{
		top++;
		stack[top]=value;
		return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		return (top==size-1);
	}
	
	public int pop() {
		return stack[top--];
	}
	public int peak() {
		return stack[top];
	}

	public int search(int value) {
		int temp=top;
		for(int i=top; i>=0; i--) {
			if(value==stack[i]) {
				return temp;
			}
			temp--;
		}
		return -1;
	}
}
