package com.arrayhw;

public class SplitArrayOddEven3 {

	public static void main(String[] args) {
		 
		int x[]={1,2,3,4,5,6,7,8,9,10};
			
		int a[]= new int [x.length ];
		
		int b[] = new int[x.length ];
				 
 for (int i=0; i<a.length; i++)
 {
	 a[i]=x[i];
	 
	 if (a[i]%2==0){
	 System.out.print(" "+a[i]+" ");
	 }
 }
 System.out.println(" ");
 
  for (int i=0; i<a.length; i++) 
    { 
	 b[i]=x[i];
	 if (a[i]% 2 != 0){
	 System.out.print(" "+b[i]+" ");
	 }
	 }
  }

}
