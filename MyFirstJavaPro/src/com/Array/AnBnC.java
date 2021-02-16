package com.Array;

public class AnBnC {

	public static void main(String[] args) {

 int a[]={6,7,8,4,9};
 int b[]={5,6,74,3,9};
 int c[]={4,8,9,6,1};
 
 for (int i=0; i<a.length; i++){
	 for (int j=0; j<b.length; j++){
		 for (int k=0; k<a.length; k++){
		
				 if (a[i]==b[j] && b[j]==c[k])
			 
			 System.out.println(a[i]);
			 
		 }
	 }
 }

	}

}
