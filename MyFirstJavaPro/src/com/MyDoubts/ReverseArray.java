package com.MyDoubts;

public class ReverseArray {

	public static void main(String[] args) {
	 
		String s = "i love java programming";
		String c[]=s.split(" ");
	 
		for (int i=c.length-1; i>=0; i--){
			System.out.print(c[i]+" ");
		}

	}

}
