package com.Basics.Hari;

public class Primenumber {
	

	public static void main(String[] args) {

     int num = 2;
     int sum = 0;
		for (int i=2; i<=num; i++)
		{
			if (num%i==0)
			{
				sum =sum+1;
				//System.out.println(i);
			}
		}
			if (sum !=1)
				
			{
				System.out.println(num+"  not prime");
			}
			else
			{
				System.out.println(num+"  is a prime");
			}
	}

}