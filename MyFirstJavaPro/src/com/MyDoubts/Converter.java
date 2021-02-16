package com.MyDoubts;

import java.util.Scanner;



public class Converter {
    
 
	public static String toBinary(int num) {
		 String binary="";
   	 while(num > 0) {
   	 	 binary = (num%2)+binary;
	 	    num /= 2;
   	 }
   	 return binary;   
}
	

 

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
		
		/*
		
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
    int rem_amt = amount;
		for (int i = 1 ; i <= 6 ; i++) {
    int paid = (int)Math.ceil(10/100.0*rem_amt);
    rem_amt -= paid ;
    }
System.out.println(rem_amt);




 
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
	int s =10;
		 for(int i=1; i<=6; i++){

int a =amount/s;

  amount = amount-a;
  
  

  } 
   amount-=1;
  System.out.println(amount);   */

	}

}
