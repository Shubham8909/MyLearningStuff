package com.testing.srting;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class LambdaUsing {
	
	public void myname(Condition condition) {
	}

	public static void main(String[] args) {
	
		
		String s="shubham";
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		
		list.forEach(System.out::println);
 
	}

}
