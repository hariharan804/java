package com.strings.hw;

public class SountIs {

	public static void main(String[] args) {
		String s ="Mississippi is a place";	
		
		 String  c[]=s.split(" ");
		    int count=0;
		/*  for (int i=0; i<c.length; i++){
			
			
			 System.out.println(c[i]);
		  }  
		  */
		  for (int i=0; i<c.length; i++){
			  if (c[i].equals("is"))
			  {
				   count++;
			  }  
		  }
		  System.out.println("no.of is => "+count);
			
		
	}

}
