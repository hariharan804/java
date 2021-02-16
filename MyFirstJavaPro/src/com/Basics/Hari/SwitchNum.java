package com.Basics.Hari;

public class SwitchNum {

	public static void main(String[] args) {

		
		int a = 20;
		int b = 6;
		int num = 4;
		int c=0; 
		 
		
		switch(num)
		
		{
			case 1:
				 c=a+b;
				
				System.out.println(c);
				break;
				
			case 2:
				 c=a-b;
				
				System.out.println(c);
				break;
				
			case 3:
				 c=a*b;
				
				System.out.println(c);
				break;
				
			case 4:
				 c=(a/b)*100;
				
				System.out.println(c);
				break;
				
			case 5:
				 c=a%b;
				
				System.out.println(c);
				break;
				
		default:
		
			{
				System.out.println("invalid NO");
			}
		}
		
	}

}
