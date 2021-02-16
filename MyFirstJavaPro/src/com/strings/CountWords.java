package com.strings;

public class CountWords {

	public static void main(String[] args) {
	
		String s = "India is my country";
		  int count=0;
		char c[]=new char [s.length()];
		for (int i=0; i<c.length; i++)
		{
			//char d[]=s.toCharArray();
			c[i]=s.charAt(i);
			
			//System.out.println(c[i]);
			//System.out.println(d[i]);
			if (c[i]==' ')	{
			//	count++;
			}
			else if (c[i]!=' '){
				count++;
			}
		else if(c[i]>=65 && c[i]<=90){
			
			count++;
			 System.out.print(c[i]);
		}  

		
		 
		}
		  
		System.out.println("Totall Word Count => "+count);
	}

}
