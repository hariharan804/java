package com.pattern.hari;

public class CheckPatten {

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
		//ha=ha+2;
		System.out.print(i+" ");
	}
	System.out.println();
}

}
}