package com.Basics.Hari;

public class RangeOfNum {

	public static void main(String[] args) {

	/*	for (int num = 1; num <= 1000; num++)

		{

			// int num = 28;
			int sum = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;

				}
			}
			if (sum == num)

			{
				System.out.println(num + " perfect");
			} else {
				//System.out.println(num + "  not perfect");
			}

		}

	}

}
*/
		
		//for(int num=1; num<=1000; num++)
		
		//{

	     int num=17;
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
}

