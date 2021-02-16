package com.strings.hw;

public class WordC {

	public static void main(String[] args) {
		char a[] = { 'j', 'a', 'v', 'a' };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println(a[i]);
		}
	}

}
