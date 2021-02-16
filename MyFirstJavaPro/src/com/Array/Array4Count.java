package com.Array;

public class Array4Count {

	public static void main(String[] args) {
		
		int a[]={7,5,2,11,14,11,0};
		
		int serch =11;
		int count =0;
		//To count an element in an array
		
		for (int i=0; i<a.length; i++)
		{
			if (serch==a[i])
			
			{
				count=count+1;
				
			}System.out.println(count);
		}
	}

}
