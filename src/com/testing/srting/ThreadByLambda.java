package com.testing.srting;

public class ThreadByLambda extends Thread {
	
	
	public void run() {
		 System.out.println( Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
		 System.out.println( Thread.currentThread().getName());
			System.out.println("bro I am here ");
		}
	}
	

}
