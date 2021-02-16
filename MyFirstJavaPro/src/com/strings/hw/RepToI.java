package com.strings.hw;

public class RepToI {

	public static void main(String[] args) {
		 String s ="Mississippi is a place";	
		  //char c[]= new char [s.length()];
		     
		 /* for (int i=0; i<c.length; i++){
			
			  c[i]=s.charAt(i);
			 // System.out.println(c[i]);
		  }  
		  */
		  
		char  c[]=s.toCharArray();
		  
		  for (int i=0; i<c.length; i++){
			  if (c[i]=='i')
			  {
				   c[i]=(char) 'I';
				
			  }  
			  System.out.print(c[i]);	   
		  }
		    

	}

}
