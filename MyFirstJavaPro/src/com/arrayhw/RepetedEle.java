package com.arrayhw;

public class RepetedEle {

	public static void main(String[] args) {
		 
		char a[]={'j','a','v','a'};
		 
		 
		for (int i=0; i<a.length; i++)
		{ 
			for (int j=i+1; j<a.length; j++){

			if(a[i]==a[j])
			{

				System.out.println(a[i]);
			}
			} 
		}
	}

}
