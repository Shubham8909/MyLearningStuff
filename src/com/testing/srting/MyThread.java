package com.testing.srting;

public class MyThread extends Thread {
	
	int total;
	
	public void run() {
		synchronized (this) {
	System.out.println("Child thread run");
		for(int i=1; i<=100; i++) {
			total+=i;
		}
		System.out.println("notify method call");
		this.notify();
		}
	}

}
