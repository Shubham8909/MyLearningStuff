package com.testing.srting;

public class ClassThread {

	public static void main(String[] args) throws InterruptedException {
       
		MyThread t= new MyThread();
		t.start();
		
		synchronized (t) {
			System.out.println("main method called ");
		    t.wait();
		    System.out.println("main method get notified");
		    System.out.println(t.total);
		}

	}

}
