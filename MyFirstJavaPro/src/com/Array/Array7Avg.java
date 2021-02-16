package com.Array;

public class Array7Avg {

	public static void main(String[] args) {
		 int s[]={5,5,5,5};
		 int sum = 0;
		 
		 for (int i=0  ; i<s.length; i++){
			 sum = sum+s[i];
		 }
		 double avg = sum/s.length;
System.out.println(sum+" "+avg);
	}
}
