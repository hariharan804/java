package com.MyDoubts;

public class prime {

	public static void main(String[] args) {
		
		int num1 =16;
		int sum1 =0;
		
		for (int i=1; i<=num1; i++){
			
			if (num1%i==0){
				sum1=sum1+1;
				}
			
		}
		if (sum1!=1){
			//System.out.println("npr "+num1);
		}
		else
		{
			//sSystem.out.println("p"+num1);
		}
		
		//perfect
		
		//int nu = 28;
		
		
		for(int i=2; i<=10000; i++)
		
		{
			int su = 1;
			for (int j=2; j<i; j++){
		
			
			if (i%j==0){
				su=su+j;	
				
				//dividers
				//System.out.println(su);
			}
		}
		
		
		if(su==i){
			System.out.println("per"+i);
		}else{
			//System.out.println("nper");
		}
		//System.out.println(su);
		
		
		//root
		
		int m = 16;
		int div =0;
		for (int k=1;  k<=m; k++){
			 
			 div = k;
		}
		if (m/div==div)
		{
			//System.out.println("root"+div);
		}else{
			//System.out.println("noroot");
		}
			
		}
	}
}
