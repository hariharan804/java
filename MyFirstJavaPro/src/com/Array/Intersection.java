package com.Array;

public class Intersection {

	public static void main(String[] args) {

	/*	int a[]={11,3,11,6,8};
		int b[]={26,6,45,8,9};
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<b.length; j++)
			{
				if (a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
		*/
		//Remove Dupicate in an array
		
	 	int a[]={11,3,11,6,8,61};
		 
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]==a[j])
				{
					a[j]=0;
				}
				
			}
		}
		for (int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}  
	}

}
