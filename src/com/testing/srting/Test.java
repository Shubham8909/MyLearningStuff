package com.testing.srting;

import java.util.EmptyStackException;
import java.util.Stack;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ThreadGroup system= Thread.currentThread().getThreadGroup().getParent();
		ThreadGroup[] t= new ThreadGroup[system.activeGroupCount()];
		system.enumerate(t);
		for(ThreadGroup t1: t) {
			
			System.out.println(t1.getName()+"----"+t1.isDaemon());
		}
		
		/*
		 * ThreadGroup g= new ThreadGroup("Frist Group");
		 * System.out.println(g.getParent().getName());
		 * 
		 * ThreadGroup g1= new ThreadGroup(g,"Frist Group");
		 * System.out.println(g1.getParent().getName());
		 */
		
		
		/*
		 * System.out.println(Thread.currentThread().getThreadGroup().getName());
		 * System.out.println(Thread.currentThread().getThreadGroup().getParent().
		 * getName());
		 */
		/*
		 * Decrytor d= new Decrytor("Shubham"); String eCode= d.encrypt("Shubha@89");
		 * d.decrypt(eCode);
		 */
		
		/*
		 * java.util.Stack<Integer> s1= new Stack<>(); //s1.peek(); int i=10; if(i==10)
		 * { throw new isEmptyStackException("Doom MAchale"); }
		 */
		
		/*
		 * SinglyLinkedlist s= new SinglyLinkedlist(); System.out.println( s.add(2));
		 * System.out.println( s.add(4)); System.out.println( s.add(7));
		 * System.out.println( s.add(8 ));
		 * 
		 * 
		 * s.printAll();
		 * 
		 * s.reverse();
		 * 
		 * System.out.println("----------");
		 * 
		 * s.printAll();
		 */
	   
	   
	   
	}

}
