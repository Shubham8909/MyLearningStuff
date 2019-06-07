package com.testing.srting;

public class RunabaleTest {

	public static void main(String[] args) {
		//RunnableClass r= new RunnableClass();
		 System.out.println( Thread.currentThread().getName());
		Thread t= new Thread(() -> {
				for(int i=0; i<10; i++) {
					 System.out.println( "in class"+Thread.currentThread().getName());
						System.out.println("bro I am here ");
					}
		});
		t.start();
		 System.out.println( Thread.currentThread().getName());
	}

}
