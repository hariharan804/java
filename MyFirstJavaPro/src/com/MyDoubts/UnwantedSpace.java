package com.MyDoubts;

public class UnwantedSpace {
	public static void main(String[] args) {
		String str = "   The      Payilagam    is    a     Institute      ";
		String x = "";
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if ((c[i] >= 'a') && (c[i] <= 'z') || (c[i] >= 'A') && (c[i] <= 'Z')) {
				x=x+c[i];
				 
				if (c[i +1] == ' ') {
					x=x+ " ";
				}
			}
		}
		System.out.println(x);
		
		/*
		 * for (int i = 0; i < 100000; i++) { if (i == 5) { System.out.println(i); i =
		 * 100000; } }
		 
		int no=132,sum=0,rem=0;
		int no1=no;
		while(no!=0)
		{
		rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		}
		System.out.println("sum"+sum);
		if(no==sum)
		{
			System.out.println(no1+" is number palindrome");
		}
		else
		{
			System.out.println(no1+ " is not palindrome");
		}
		
		
		int no12=27;
		int div1=2;
		while(no12/2>div1)
		{
			if(no12/div1==div1)
			{
				System.out.println(div1+" root");
				break;
			}
			div1++;
		}
		*/
	}
}

