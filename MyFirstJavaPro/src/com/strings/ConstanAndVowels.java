package com.strings;

public class ConstanAndVowels {

	public static void main(String[] args) {
		
		String s="amalala got noble prize fot peace";
        char c[]=new char [s.length()];
		int countvowl=0;
		int countcons=0;
		int countsp=0;
		for (int i=0; i<c.length; i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0; i<c.length; i++)
		{
			if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				countvowl=countvowl+1;
			}
			else if (c[i] >='a' && c[i]<='z')
			{
				countcons=countcons+1;
			//	System.out.println(c[i]);
			}
			if (c[i]==' '){
				countsp++;
			}
		}
		System.out.println("vowels count => "+countvowl);
		System.out.println("constants count => "+countcons);
		System.out.println("Space count => "+countsp);

	}

}
