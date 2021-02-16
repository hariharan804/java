package com.Array;

public class Spitlt4Array {

	public static void main(String[] args) {
		
						// 4 Big Arraay Spilt 
						
						int x[]={11,23,13,41,15,61,17,81,19,10,11,60};
						
						int a[]= new int [x.length/4];
					
						int b[] = new int[x.length/4];
						
						int c[]= new int [x.length/4];
						
						int d[]= new int [x.length/4];
						
						 
				 for (int i=0; i<a.length; i++)
				 {
					 a[i]=x[i];
					 System.out.print(" "+a[i]+" ");
					 
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
				 for (int i=0; i<b.length; i++) 
				 {
					 c[i]=x[c.length+b.length+a.length+i];
					 
					 System.out.print(" "+d[i]+" ");
				 }
				 
				 for (int i=0; i<x.length; i++)
					{
						for (int j=i+1; j<x.length;j++)
						{
							if (a[i] < a[j])
							{
								int temp =a[i];
								a[i]=a[j];
								a[j]=temp;
								
							}
							System.out.println(a[j]);
							
						}
						
							
					}

				 
	}

}
