package com.Basics.Hari;

public class prime100 {

	public static void main(String[] args) {
		
	for(int num=2; num<=100; num++)
			
		{

	 // int num=6;
		 int count=0;
		
		for (int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
				
		}
		
		if(count==0)
		{
			System.out.println("PN "+num);
		}
		else
			
		{
			 //System.out.println("NPN  "+num);
		}	
		}
		
		
		int num1 = 4;
	    boolean flag = false;
	    for (int i = 2; i <= num1 / 2; ++i) {
	      // condition for nonprime number
	      if (num1 % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num1 + " is a prime number.");
	    else
	      System.out.println(num1 + " is not a prime number.");
	
}
}
