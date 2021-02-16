package com.strings.hw;

public class CountA {

	public static void main(String[] args) {
		 
		String c[]={"chennai","madurai","theni","thiruvannamalai"};

		for (int i=0; i<c.length; i++)
			
		{
			 char f[] = c[i].toCharArray(); 
			 int count = 0;
			//System.out.print(f[i]);
		
		for (int j=0; j<f.length; j++)
		{
		
 		 if (f[j]=='a'){
 			count=count+1;
 		 }
 		
		}
		System.out.println(count+"/"+c[i].length());
		}	 	
	}
}
