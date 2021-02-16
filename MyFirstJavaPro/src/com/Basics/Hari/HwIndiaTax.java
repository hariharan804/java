package com.Basics.Hari;

public class HwIndiaTax {

	public static void main(String[] args) {

		
		double amount = 1001;
		double tax = 0; 
		
		int num=1;
		
		double a=0;
        double b=0;
        double c=0;
       
        
		switch(num)
		
		{
		case 1:
			if(amount <=250000 && amount>=0)
				
				 
			{
				 
				 
				System.out.println("No Tax Enjoy  Finalay Your get Salary Rs."+amount);
			}
 
		case 2:
			if(amount <=500000 && amount>=250001)
				
				
			{
				a=(amount*5)/100;
				System.out.println("5% Tax & Your Tax Amount = "+a +"  Finalay Your get Salary Rs."+(amount-a) );
			}
			
		case 3:
			if(amount <=1000000 && amount>=500001)
				
				
			{
				b=(amount*10)/100;
				System.out.println("10% Tax & Your Tax Amount Rs."+b +"  Finalay Your get Salary Rs."+(amount-b));
			}
			
		case 4:
			if(amount <=100000000 && amount>=1000001)
				
				
			{
				c=(amount*30)/100;
				System.out.println("30% Tax & Your Tax Amount = "+c +"  Finalay Your get Salary Rs."+(amount-c));
			}
			
		}
		
	}

}
