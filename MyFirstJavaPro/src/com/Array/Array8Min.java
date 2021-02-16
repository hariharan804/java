package com.Array;

public class Array8Min {

	public static void main(String[] args) {
			
			int a[]={377,9,20,11,35,50,3,1};
			int min= a[0];
			
			for (int i=0; i<a.length; i++)
			{
				if (min>a[i])
				{
					min=a[i];
				}
			}System.out.println(min);
		}

	}

