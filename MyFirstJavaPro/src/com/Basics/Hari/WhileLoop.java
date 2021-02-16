package com.Basics.Hari;

public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * int i=1;
		 * 
		 * while (i<=15)
		 * 
		 * { System.out.println(i);
		 * 
		 * i=i+1; } }
		 * 
		 * }
		 */

		boolean flag = false;
		int num = 17;
		int i = 2;

		while (i <= num)

		{
			if (num % i == 0) {

				flag = true;
				break;
			}
			i = +1;
		}

		System.out.println(flag);
	}

}
