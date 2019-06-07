package com.testing.srting;

public class RunnableClass implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			 System.out.println( "in class"+Thread.currentThread().getName());
				System.out.println("bro I am here ");
			}
	}

}
