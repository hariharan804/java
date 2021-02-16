package com.arrayhw;

public class UnicEle5 {

	public static void main(String[] args) {
		int a[]={10,5,3,4,7,4,8,5,10,9};
		for (int i=0; i<a.length; i++){
			
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			 if (a[i]==a[j])
			 {
				 a[j]=0;
				 
			 }				
			}
			  
				System.out.println(a[i]);
		}

	}

}
