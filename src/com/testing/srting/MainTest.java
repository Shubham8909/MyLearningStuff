package com.testing.srting;

public class MainTest {

	public static void main(String[] args) 
	{
		Stack s= new Stack();
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		
		/*
		 * System.out.println(s.peak()); System.out.println(s.peak());
		 */
		
		System.out.println(s.search(5));
	}

}
