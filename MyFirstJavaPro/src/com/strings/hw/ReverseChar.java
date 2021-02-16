package com.strings.hw;

public class ReverseChar {

	public static void main(String[] args) {


	char s[]={'r','a','m','a'};
	
 	char c[]= new char [s.length];
	
	for (int i=0; i<s.length; i++)
		
	{
		c[i]=s[i];
		//System.out.print(" "+c[i]+" ");
	}
	for (int i=c.length-1; i>=0; i--){
		
		System.out.print(" "+c[i]+" ");	
	}
 
 
	
/*	
for (int i=s.length-1; i>=0; i--){
		
		System.out.print(" "+s[i]+" ");	
	}
 */
	}

}
