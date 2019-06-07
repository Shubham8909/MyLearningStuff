package com.testing.srting;

public class ExceptionCheck {
	int i=200;
	public void foo() {
	   try {
		throw new Exception();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
class childException extends ExceptionCheck{
	int i=1000;
	public void foo() {
		System.out.println("childExceptionafdfabdbzxv");
	}
	
}
class TestException{
	
	public static void main(String[] args) {
		ExceptionCheck e= new ExceptionCheck();
		
		e.foo();
		System.out.println("avdbavc");

		
		
		/*
		 * System.out.println(e.i); ExceptionCheck r=(ExceptionCheck)e;
		 * System.out.println(r.i); r.foo();
		 */	}
}
