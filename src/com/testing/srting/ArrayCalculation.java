package com.testing.srting;

public class ArrayCalculation {

	public static void main(String[] args) {

		Integer[] ar = {-3, 2, 3, -4, 3, 1 };
		int sum = 0;
		int max = 0;
		System.out.println("adgsdfhsjd");
		for (int i = 0; i < 6; i++) {
			int a = 2;
			sum=0;
			for (int j = i; j < 6; j++) {

				if (j == i) {
					System.out.println(sum+"sum");
					sum = sum + ar[j];
				}
				if (j > i && a<=6) {
					
					for (int k = j; k <a+1; k++) {
						sum = sum + ar[k];
					}
					j++;
					a = a + (a + 1);
				}

			}

			if (max < sum) {
				System.out.println(sum+"sum1");
				max = sum;
				sum = 0;
			}

		}

		System.out.println(max);

	}
}
