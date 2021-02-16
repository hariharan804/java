package com.Basics.Hari;

public class parten {

	public static void main(String[] args) {
		int va = 3;
		for (int i = 1; i <= 5; i++)

		{
			for (int j = 1; j <= i; j++) {
				System.out.print(va + " ");
				va = va + 2;
			}
			System.out.println();
		}
	}

}
