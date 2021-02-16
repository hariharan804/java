package com.Array;

public class CountWovl {

	public static void main(String[] args) {
		
char c[]={'h','a', 'r','i','h','a','r','a','n'};
		int count = 0;
		for (int i=0 ; i<c.length; i++){	
				
			if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count = count+1;
			}
						
			
		}
		System.out.println(count);

	}

}
