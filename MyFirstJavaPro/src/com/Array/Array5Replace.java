package com.Array;

public class Array5Replace {

	public static void main(String[] args) {
		
		int a[]={5,6,7,5,8,5,7,5};
		int find= 5;
		int rep=0;
		
		for (int i=1; i<a.length; i++)
		{
			if (find==a[i])
			{
				a[i]=rep;
			}
			System.out.println(a[i]);
		}
	}
}
