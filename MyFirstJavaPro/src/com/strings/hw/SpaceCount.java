package com.strings.hw;

public class SpaceCount {

	public static void main(String[] args) {
		String s ="Mississippi is a place";	
		int count = 0;
		char c[]= new char [s.length()];
		
		for (int i=0; i<s.length(); i++){
		c[i]=s.charAt(i);
		}
		for (int i=0; i<s.length(); i++){
			//System.out.println(c[i]);
			if (c[i]==' ')
			{
				count++;
				
			}
			
		}
		System.out.println("no.of Space => "+count);
	 
	}

}
