package com.homework;

public class MandDMultiple {

	public static void main(String[] args) {

		int counter = 0;
		int a = 0;
		int count = 0;

		for (int i = 1; i <= 100; i++)

		{
			if (i % 7 == 0)

			{
				counter = counter + 1;

			}
			if (i % 7 == 0 && i % 2 == 0) {
				count = count + 1;
				System.out.print("[" + i + "]");
			}

		}
		System.out.println(" - 2 Divisible Counts=" + count);

		System.out.println("  " + "7* Total counts=" + counter);

	}

}
