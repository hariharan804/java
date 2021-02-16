package com.strings.hw;

public class WordPattenA {

	public static void main(String[] args) {
		 char a[] ={'j','a','v','a'};
		 	
		   for (int i = 0; i <a.length-1; i++) {
	           for (int j = 0; j <= i; j++) {
	               System.out.print(a[j]);
	           }
	           System.out.println();
	       }
		   for (int i = a.length-1; i >= 0; i--) {
	           for (int j = 0; j <= i; j++) {
	               System.out.print(a[j]);
	           }
	           System.out.println();
	       }

	}

}
