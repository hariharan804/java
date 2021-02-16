package com.arrayhw;

public class AddPlusEven7 {

	public static void main(String[] args) {
		int n[]={1,2,3,4,7,11};
         int a[]= new int [n.length];
         
         for (int i=0; i<n.length; i=i+2){
    		 
 			a[i]= n[i]+n[i+1];	
 			System.out.println(a[i]);
 		}
	/*	int odd =0;
		int even =0;
		for (int i=0; i<n.length; i++){
			
				if (n[i] %2==0)
				{
					even=even+n[i];
					//System.out.println(n[i]);
					    				
			}	
				if (n[i] %2!=0)
				{
					odd = odd+n[i];
					 
				//	System.out.println(odd);
					
				}
				
		}
		System.out.println("Even Sum "+odd); 
		System.out.println("Even Sum "+even); 	*/	
	
	}

}
