package com.strings;

public class RpAta {

	public static void main(String[] args) {
		
		String s = "India is my country";
char c[]=new char [s.length()];
		
	/*	for (int i=0; i<c.length; i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0; i<c.length; i++)
		{
			if (c[i]=='a')
			{
				c[i]='@';
			}
			System.out.print(c[i]); 
		} */

//chage lower case

for (int i=0; i<c.length; i++)
{
	c[i]=s.charAt(i);
if (s.charAt(i)>=97 && s.charAt(i)<=122 )
{
	System.out.print(c[i]);
}
else if(s.charAt(i)>=65 && s.charAt(i)<=90){
	c[i]=(char) (c[i]+32);
	System.out.print(c[i]);
}

}
	}

}
