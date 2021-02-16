package com.homework;

public class Dparttern {

	public static void main(String[] args) {

		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {

				if (i == 1 || i == 9 || i ==0 || j == 2  || j == 9)

				{
					System.out.print("  *");
				} else {
					System.out.print("   ");

				}
			}
			System.out.println();

		}
	}
}


