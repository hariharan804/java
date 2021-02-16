package com.Basics.Hari;

public class prefect100 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int sum=1;
		
		for (int j=1; j<=10000;j++)
			
		{
		  int  sum=0;
			
			for (int i=1; i<j; i++ )
			{
				if (j%i==0){
			 sum=sum+i;
				}
			}
			
			if(j==sum){
				
				System.out.println(j);
			}
		}

	}

}
