package com.strings.hw;

public class RepToIs {

	public static void main(String[] args) {
		String s ="Mississippi is a place";	
		
		 String  c[]=s.split(" ");
		     
		   
		  
		  for (int i=0; i<c.length; i++){
			  if (c[i].equals("is"))
			  {
				   c[i]="the";
			  }  
			  System.out.print(c[i]+" ");
		  }
		 
	}

}



/*
 * for (int i=0; i<c.length; i++){
			
			
			 // System.out.println(c[i]);
		  } 
		  */
