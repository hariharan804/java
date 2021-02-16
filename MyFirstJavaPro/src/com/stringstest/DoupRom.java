  package com.stringstest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DoupRom {

	public static void main(String[] args) {
		/*
		 * String s = "bala"; char c[]=new char [s.length()]; for (int i=0;
		 * i<s.length(); i++){ c[i] =s.charAt(i); // System.out.println(c[i]); }
		 * int count =0; for (int i=0; i<c.length; i++){ for (int j=i+1;
		 * j<c.length; j++){
		 * 
		 * if (c[i]==c[j]){
		 * 
		 * c[j]=' '; } } if(c[i]!=' '){ //count--; count++; }
		 * System.out.print(c[i]);
		 * 
		 * }
		 * 
		 * System.out.println(count);
		 * 
		 */
   /*
    * 
    * 
    * 
    *  	HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		String s = "hariharan";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count = count + 1;
					c[j] = ' ';
					//System.out.println(c[i]);
				}
			}
			//System.out.println(c[i]);
			hs.put(c[i], count);
			
		
		}
		//System.out.println(hs);
		for (Entry<Character, Integer> entry : hs.entrySet()) {
			if (entry.getValue() == 1)
				System.out.println(entry.getKey());
		}
		
		int count=0;
		for (int i=0; i<c.length; i++){
			for (int j=i+1; j<c.length; j++){
				
				if (c[i]==c[j]){
					count =count+1;
				c[j]='0';	
				}
				if (count==0) {
					 System.out.println(c[i]);
				}
			}
			
	 	}
     */	
		char a[] = { 'q','c','a','c','f',};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				count = 0;
				if (a[i] == a[j]) {
					count++;
					a[j] = 0;
				}
			}
			if (a[i] != 0 && count == 0) {
				System.out.print(a[i] + "  ");
			}
		}

	}
}
