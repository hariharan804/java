package com.arrayhw;

public class SumElem2 {

	public static void main(String[] args) {
int a[]={1,2,3,4,5,6,7,8};
	int add=0;	
		for (int i=0; i<a.length; i=i+2)
		{
			add=add+a[i];
			System.out.print (" "+a[i]);
		}	
		System.out.println("   Total Even Index = "+add);
		
	}

}
