package com.arrayhw;

public class AuBuC8 {

	public static void main(String[] args) {
		 
		int a[]={1,2,3,4,5,8,9}; 
		int b[]={11,12,13,14,15,8};
		int d[]={21,2,23,24,25,19};
		int c[]= new int [a.length+b.length+d.length];
		
	/*	for (int i=0; i<a.length+i; i++){
			for (int j=0; j<b.length+i; j++){
				for (int k=0; k<z.length+i; k++){
					for (int l=0; l<a.length+i; l++){
					 
					if  (a[i]==b[j])
					{
						Sbstem.out.println("ff");  
						
					}
					
					
				}
				
			}
				
		  }
			
		}
		*/
		
		for (int i=0; i<a.length; i++){
			c[i]=a[i];
		}
		for (int i=0; i<b.length; i++){
			c[a.length+i]=b[i];
		}
		for (int i=0; i<d.length; i++){
			c[a.length+b.length+i]=d[i];
		}
		for (int i=0; i<c.length; i++){
			{
				System.out.print (" "+c[i]+" ");
			}
		}
		
	}

}
