package com.arrayhw;

public class BsetOfA {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
	 //int b[]={9,8,7,67,65,43};
		int b[]= {1,2,3,4,5,6};
		
		for (int i=0; i<a.length; i++){
			//for (int j=0; j<b.length; j++){
				
				if(a[i]==b[i])
				{
					System.out.println("B subset of A");
					break;
				}
				 else if(a[i]!=b[i])
				{
					System.out.println("B not  subset of A");
					break;
				}
		}
 
	}
	 
}
