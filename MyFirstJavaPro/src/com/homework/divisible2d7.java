package com.homework;

public class divisible2d7 {

	public static void main(String[] args) {
		
		int a=0;
		 
	 
		for (int i=10; i<=99; i++)
			
		
		{
			a=i+a;		 	 
		}		
		System.out.print("The sum of all the 2-digit numbers is:"+a);
		System.out.println("     4905/7="+a/7);
		
		for (int j=10; j<=99; j++)
			
		if (j%7==0)
		{
			System.out.print(" "+j);
		}
		}

}
