package com.Basics.Hari;

public class SwitchCase {

	public static void main(String[] args) {

		int mark = 1000;
		int num = 1;
		
		switch(num)
		
		{
			case 1:
				if(mark <=49 && mark>=0)
				{
					System.out.println("F");
				}
				
		
				
			case 2:
				if(mark <=59 && mark>=50)
				{
					System.out.println("E");
				}
				
			case 3:
				if(mark <=69 && mark>=60)
				{
					System.out.println("D");
				}		
				
			case 4:
				if(mark <=79 && mark>=70)
				{
					System.out.println("C");
				}
				
			case 5:
				if(mark <=89 && mark>=80)
				{
					System.out.println("B");
				}
				
			case 6:
				if(mark <=100 && mark>=90)
				{
					System.out.println("A");
				}
				
			case 7:
				
				if (mark <=1000 && mark>=101 )
				{
					System.out.println("Over ha padikkatha");
				}
		}
		
	}
	
}	
	
