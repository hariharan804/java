package com.strings;

public class MirrorString {

	public static void main(String[] args) {
		
		String s ="india is my country";
		
		String ss ="india is my country";
				
		char a[]=s.toCharArray();
       String b[]= ss.split(" ");
		//char c[]= ss.toCharArray();
		
		for (int i=a.length-1; i>=0; i--)
		{
			 System.out.print(a[i] );
		}
		for (int i=b.length-1; i>=0; i--){
			//
			System.out.print(b[i]+" ");
			//System.out.println(c[i]);
		}
		 
			 
		
	}

}
