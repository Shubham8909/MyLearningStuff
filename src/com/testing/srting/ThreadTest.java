package com.testing.srting;

public class ThreadTest {

	public static void main(String[] args) {
		
	  System.out.println( Thread.currentThread().getName());
		ThreadByLambda t= new ThreadByLambda();
		t.start();
		for(int i=0; i<10; i++) {
			 System.out.println( Thread.currentThread().getName());
				System.out.println("bro I am here ");
			}
	}

}
