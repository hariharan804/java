package com.arrayhw;

public class AuBnC9 {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,8}; 
		int b[]={11,21,13,14,15,8};
		int d[]={21,2,23,24,25,8};
		int c[]= new int [a.length+b.length];
		int m[]= new int [c.length];
		for (int i=0; i<a.length; i++){
			c[i]=a[i];
		}
		for (int i=0; i<b.length; i++){
			c[a.length+i]=b[i];
		}
		for (int i=0; i<d.length; i++){
			
			if (c[i]==d[i])
			{
				//System.out.print (" "+c[i]+" ");
				m[c.length ]=d[i];
			}
		}
		for (int i=0; i<c.length; i++){
			{
				 System.out.print (" "+m[i]+" ");
			}
		}
	}

}
