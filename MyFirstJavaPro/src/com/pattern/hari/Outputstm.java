package com.pattern.hari;

public class Outputstm {

	public static void main(String[] args) {

		/*
		 * System.out.print("*"); System.out.print("*");
		 * 
		 * System.out.println("*"); System.out.println("*");
		 */

		/*
		 * for (int i=1; i<=5; i++) { System.out.print("*");
		 * 
		 * 
		 * }
		 * 
		 * for (int i=1; i<=5; i++) { System.out.println("*");
		 * 
		 * }
		 */
		int a = 5;
		for (int i = 1; i <= a; i++) {

			// System.out.print("#");

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}