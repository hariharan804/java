package com.Array;

public class SplitArray {

	public static void main(String[] args) {
		// Big Arraay Spilt 
		
		int x[]={11,23,13,41,15,61,17,81,19,10,11,12,};
		
		int a[]= new int [x.length/2];
	
		int b[] = new int[x.length/2];
		
		//transfer of elemwnts from x to ab
 for (int i=0; i<a.length; i++)
 {
	 a[i]=x[i];
	 System.out.print(" "+a[i]+" ");
	 
 }
 System.out.println(" ");
 for (int i=0; i<b.length; i++) 
 {
	 b[i]=x[a.length+i];
	 
	 System.out.print(" "+b[i]+" ");
 }
 
 
	}

}
