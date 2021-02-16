package com.pattern.hari;

public class PairBox {

	public static void main(String[] args) {
		
 /*
 
for (int i=0; i<=4; i++)
			
		{
			  
			System.out.println("["+(i*2)+","+(i*2+1)+"]");
		 
		}
			
	*/	
		 
for (int i=0; i<=999; i++)
{
	if (i<=9)	
		{
			  
			System.out.println("<"+i+">");
		 
		}
 
   if (i>9 && i<=99)	
{
	  
	System.out.println("["+i+"]");
 
}
   if (i>99 && i<=999)	
   {
   	  System.out.println("{"+i+"}");
   	 
   }
   
}
	
	}
}
