package com.arrayhw;

public class SingleRotation6 {

	public static void main(String[] args) {
	
		         int j;  
                 int last=0;    
	        int a[]={5, 6, 8, 7, 5};     		           
		    for(int i = 0; i<4; i++){    
			        	 
	         last = a[a.length-1];    
		     
		     for(j = a.length-1; j > 0; j--){    
			       // System.out.println(j);          
	         a[j] = a[j-1];    
		        }     
			             
		            a[0] = last;    
			    }   
			      
              System.out.println("single rotation");    
	          for(int i = 0; i< a.length; i++){    
	            System.out.print(a[i] + " ");    
			      }
	}

}
