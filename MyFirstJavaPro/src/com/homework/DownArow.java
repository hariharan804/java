package com.homework;

public class DownArow {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {

				if (i == 9 || i == 9 || j == 9|| i==9   || j == i)

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
