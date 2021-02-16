package com.strings;

public class SplitArrray {

	public static void main(String[] args) {
		
		String s = "sanker. like. java" ;
		
		/*	String a[] = s.split(".");
		
		for (int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		} */
		
	/*	byte c[]=s.getBytes();
		
		for (int j=0; j<c.length; j++)
		{
			System.out.println(c[j]);
		} 
		*/
char c[]=s.toCharArray();
		
		for (int j=0; j<c.length; j++)
		{
			System.out.println(c[j]);
		} 
		
	}

}
