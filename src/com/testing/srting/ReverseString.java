package com.testing.srting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] arg) {
	    
				Scanner s = new Scanner(System.in);
			    
			    // Get L and R from the input
				int L = s.nextInt();
				int R = s.nextInt();
		    
		   ///Write here the logic to print all integers between L and R
		        for(int i=L;i<=R;i++)
		            System.out.print(i);
		        System.out.println();

		        s.close();
		            
		        
		/*
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println(str1);
		 * 
		 * String s = "a!!!b.+=-_A   c.d,e'f,ghi"; char[] charArray = s.toCharArray();
		 * int length = charArray.length; int l = 0; int r = length - 1; String
		 * str=s.replaceAll(" ", ""); System.out.println(str); while (l < r) { if
		 * (!Character.isAlphabetic(charArray[l])) { l++; } else if
		 * (!Character.isAlphabetic(charArray[r])) { r--; } else { char temp =
		 * charArray[l]; charArray[l] = charArray[r]; charArray[r] = temp; l++; r--; } }
		 * String s1 = new String(charArray); System.out.println(s1);
		 */
	}
}
