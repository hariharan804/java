package com.arrayhw;

public class StrSort {

	public static void main(String[] args) {
		 String a[]={"a","b","c"};
		 char b[]= new char [a.length];
		 
		 for (int i=0; i<a.length; i++){
			 b[i]=a[i].charAt(i);
		 }
		 for (int j=0; j<b.length; j++){
			 System.out.println(b[j]);
		 }
		 }
	}

