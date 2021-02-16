package com.MyDoubts;

public class ZeroOne {
	public static void main(String[] args) {
	for (int i=1; i<=5; i++){
			for (int j=1; j<=5; j++){
	         if (i%2!=0){
	        	 System.out.print("01"); 
	         }else{
	        	 System.out.print("10");
	         }
			}
			System.out.println("");
		}
	}
}
