package com.arrayhw;

public class aSort {

	public static void main(String[] args) {
		int a[]={51,4,31,2,11,91,1};
		
		for (int i=0; i<a.length; i++){
			for (int j=i+1; j<a.length; j++){
				
				if (a[i] > a[j]){
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
				}
		}
			System.out.println(a[i]);
		}
		
	}

}
