package com.arrayhw;

public class CharIncrement {

	public static void main(String[] args) {
		//char c[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
		 
		 char c[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		         
		char b[]= new char [c.length];
		 
		/*		for (int i=0 ; i<c.length; i++){
				
					b[i]=(char) (c[i]+i+1);
					System.out.print(" "+b[i]+" ");  */
					
		 
		 int oi=0;
		 char sf;
				for (int i=1; i<=26; i++){
				 
					
							oi=96+i;
							oi=i+oi;
							sf=(char) oi;
						
					System.out.print(" "+sf+" "+" ");
					
				 
				}
 }

}
