package com.testing.srting;

public class pattern {
	
	public static void main(String[] args) {
		int count=1;
		for(int i=0; i<8; i++) {
		
			if(i<4) {
			for(int j=4; j>0; j-- ) {
				if(j<=i+1) {
					System.out.print(count);
					count++;
				}else {
					System.out.print(" ");
				
				}
			}
			System.out.println();
				
				  }else { 
					  for(int j=8; j>4; j-- ) {
						  
						  if(i>=4) {
							  System.out.print(" ");
						  }else {
					  count--; 
				  System.out.print(count);
						  }
				  } 
				  System.out.println();
				 
				 }
		}
		
	}

}


/*
 * 1 12 123 1234
 */