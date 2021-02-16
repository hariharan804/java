package com.strings;

public class Palindrom {

	public static void main(String[] args) {
		 String s= "8008";
		char[] c=s.toCharArray();
		
	for (int i=0; i<c.length/2 ; i++)
	{
		
		char temp = c[i];
		c[i]=c[c.length-i-1];
		c[c.length-i-1]= temp;
		System.out.println(c[i]);
	}
	String ss=String.valueOf(c);
	if (s.equals(ss))
	{
		System.out.println("pa");
	}
	else
	{
		System.out.println("NP");
	}
	}

}


