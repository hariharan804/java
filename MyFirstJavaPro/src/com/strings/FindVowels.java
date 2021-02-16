package com.strings;

public class FindVowels {

	public static void main(String[] args) {
		// vowl find
		
		String s = "java";
		
	 	boolean flag = false;
		
	 for (int i=0; i<s.length(); i++){
		
		if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			flag=true;
		}

		}
        System.out.println(flag);  
		
		char c[]=new char [s.length()];
		
		for (int i=0; i<c.length; i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0; i<c.length; i++)
		{
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				flag=true;
			}
		}
		System.out.println(flag); 
		/*		
char c[]=new char [s.length()];
		
		for (int i=0; i<c.length; i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0; i<c.length; i++)
		{
			if (c[i]=='a')
			{
				c[i]='@';
			}
			System.out.println(c[i]); 
		}
		
*/
	}

}
