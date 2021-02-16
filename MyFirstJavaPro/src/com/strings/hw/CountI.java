package com.strings.hw;

public class CountI {

	public static void main(String[] args) {

 String s ="Mississippi is a place";	
  char c[]= new char [s.length()];
    int count=0;
  for (int i=0; i<c.length; i++){
	
	  c[i]=s.charAt(i);
	 // System.out.println(c[i]);
  }  
  
  for (int i=0; i<c.length; i++){
	  if (c[i]=='i')
	  {
		   count++;
	  }  
  }
  System.out.println("no.of i => "+count);
	}

	 

}
