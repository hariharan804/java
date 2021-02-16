package com.Basics.Hari;

public class HwSalary {

	public static void main(String[] args) {
 
		double sa = 1000;
        int num = 1;
        double a=0;
        double b=0;
        double c=0;
        double d=0;
        
		switch(num)
		
	 
		
		{
			case 1:
				if(sa <=10000 && sa>=0)
					
					 
				{
					a=(sa*10)/100;
					
					System.out.println("This Month Increment 10% & "+"Your Salary is RS."+(sa+a));
				}
	 
			case 2:
				if(sa <=25000 && sa>=10001)
					
					
				{
					b=(sa/7)/100;
					System.out.println("This Month Increment 7% & "+"Your Salary is RS."+(sa+b));
				}
				
			case 3:
				if(sa <=100000 && sa>=25001)
					
					
				{
					c=(sa*5)/100;
					System.out.println("This Month Increment 5% & "+"Your Salary is RS."+(sa+c));
				}
				
			case 4:
				if(sa <=10000000 && sa>=100001)
					
					
				{
					d=(sa*3)/100;
					System.out.println("This Month Increment 3% & "+"Your Salary is RS."+(sa+d));
				}
				
			 				
			
		}
	}

}
