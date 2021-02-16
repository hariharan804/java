package com.Array;

public class SplitArray3 {
	
			public static void main(String[] args) {
				// Big Arraay Spilt 
				
				int x[]={11,23,13,41,15,61,17,81,19,10,11,60};
				
			 for (int k=0; k<x.length; k++)
					{
						for (int j=k+1; j<x.length;j++)
						{
							if (x[k] > x[j])
							{
								int temp =x[k];
								x[k]=x[j];
								x[j]=temp;

								
							}
							
							
						}
						System.out.println(temp);
						}
						
							
					
				
				int a[]= new int [x.length/3];
			
				int b[] = new int[x.length/3];
				
				int c[]= new int [x.length/3];
				
				//transfer of elemwnts from x to ab
		 for (int i=0; i<a.length; i++)
		 {
			 a[i]=x[i];
			 System.out.println(" "+a[i]+" ");
			 
		 }
		 System.out.println(" ");
		 for (int i=0; i<a.length; i++) 
		 {
			 b[i]=x[a.length+i];
			 
			 System.out.print(" "+b[i]+" ");
		 }
		 System.out.println(" ");
		 for (int i=0; i<b.length; i++) 
		 {
			 c[i]=x[b.length+a.length+i];
			 
			 System.out.print(" "+c[i]+" ");
			 
		 }
		 System.out.println();
		 
			}
		 
	
}

