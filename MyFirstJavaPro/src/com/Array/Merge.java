package com.Array;

public class Merge {

	public static void main(String[] args) {
		
		int a[]={7,6,46,7,8,9};
		int b[]={1,3,6,78,94,4};
		
		int c[]=new int [a.length+b.length];
		
	for (int i=0; i<a.length; i++) 
	{
		c[i]=a[i];
	}
	for (int i=0; i<b.length; i++)
	{
		
		c[a.length+i]=b[i];
		
	}
	for (int i=0; i<c.length; i++)
	System.out.print(" "+c[i]+" ");
}   
}
