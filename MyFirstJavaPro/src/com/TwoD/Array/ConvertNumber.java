package com.TwoD.Array;

public class ConvertNumber {

	public static void main(String[] args) {
		
		System.out.println("_________________________________");

		System.out.println("| Decimal"+" | Hex"+" | Octal"+" | Binary|");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i=0; i<=100; i++){	
						
		System.out.println("| "+i+"\t"+"  | "+Integer.toHexString(i)+"\t"+"| "+Integer.toOctalString(i)+"\t"+"| "+Integer.toBinaryString(i)+"\t"+"| ");
		//System.out.println("_________________________________________");
		
		}
		System.out.println("_________________________________________");
	}

}
