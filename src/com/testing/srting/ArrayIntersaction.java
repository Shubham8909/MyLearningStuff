package com.testing.srting;

public class ArrayIntersaction {

	public static void main(String[] args) 
	{
		Integer [] arr1= {21,25,88,74,96,63};
		Integer [] arr2= {20,25,87,74,99,63};
		
		Integer [] common=new Integer[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					common[i]=arr1[i];
				}
			}
		}
		System.out.print("{");
		int count=0;
		for(Integer i: common) {
			 if(i!=null) {
				System.out.print(i);
			if(count<common.length-2)
			  System.out.print(",");
			 }
			 count++;
		}
		System.out.print("}");
 
}
}