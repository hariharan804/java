package com.strings.hw;

public class CapsI {

	public static void main(String[] args) {
	/*	String c[]={"English","Tamil","irench","indi"};
	

		for (int i=0; i<c.length; i++)
			
		{
			 char f[] = c[i].toCharArray(); 
			
			 System.out.print(" ");
		
		for (int j=0; j<f.length; j++)
		{
		
 		 if (f[0]=='i'){
 			 f[0]='z';
 			 		 }
 		System.out.print(f[j]);
		}
		
		} */	
		
		int num = 2;
	     int sum = 0;
			for (int i=2; i<=num; i++)
			{
				if (num%i==0)
				{
					sum =sum+1;
					//System.out.println(i);
				}
			}
				if (sum!=1)
					
				{
					System.out.println(num+"  not prime");
				}
				else
				{
					System.out.println(num+"  is a prime");
				}
				
				
				String s = "  abc    defg hijk  as    lmopqr";
				
				char[] ss=s.toCharArray();
				String s1  = "";
				String s2[]=new String [ss.length];
				for (int i=0; i<ss.length; i++){
					
					if (ss[i]!=' '){
 			
					 System.out.print(ss[i]);
				}
				}
				
				
	}
	
}
