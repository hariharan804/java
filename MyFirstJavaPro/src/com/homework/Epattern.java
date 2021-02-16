package com.homework;

public class Epattern {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {

				if (i == 1 || i == 9 || i ==5 || j == 1  || j == 0)

				{
					System.out.print("*");
				} else {
					System.out.print("");

				}
			}
			System.out.println();

		}
	}
}
