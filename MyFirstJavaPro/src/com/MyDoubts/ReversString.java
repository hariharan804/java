package com.MyDoubts;

public class ReversString {

	public static void main(String[] args) {
		
	 //String G="1234 5678 90";
	  String G="i Love program";
     String F[]=G.split(" ");
     char a[]=new char[G.length()];
      
   for(int j=0;j<F.length;j++)
   {
   	  a=F[j].toCharArray();
    
	  for (int i=a.length-1;i>=0;i--)  
	  { 
		  System.out.print(a[i]+" ");  
    } 
   }	
		/*
		 String G="i Love program";
	      String F[]=G.split(" ");
	      char a[]=new char[G.length()];
	      char[] b=new char [a.length];
	    for(int k=0;k<F.length;k++)
	    {
	    	  a=F[k].toCharArray();
		  for (int i=a.length-1;i>=0;i--) //  decrement i value
		  {
	         for (int j=0;j<=b.length-1;j++)  //  increment j value 
	           {
		         if(j==a.length-i-1)   // this condition ensure  j i  04  13  22  31  40 to reverse array
		           {
			     b[j]=a[i];
			     System.out.print(b[j]);
			       }
		       }//3rd  for 
		 } //2nd for
	    }//1st for 
	    
	    */
	}
}
