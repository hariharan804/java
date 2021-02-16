package com.pattern.hari;

public class CheckP2 {
	 

		public static void main(String[] args) {

			

	int n=5;
	int ha=0;
	for (int i=1; i<=n; i++)
		 
	{
		for (int j=n; j>=i; j--)
		{
			System.out.print(" ");
		}
		
		 
		for (int k=1; k<=i; k++)
	  
		{
			ha=i+2;
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	 /*
int a=1;

for(int i=1; i<=5; i++)
	
	
{
	for(int j=1; j<=i; j++)
	{
		System.out.print(a+" ");
		a=a+2;
	}
	System.out.println();
} */
	}
	}