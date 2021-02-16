package com.MyDoubts;

import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
/*
		for (int i=1; i>0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Letter");
			char q = sc.next().charAt(0);

			if (q =='q') {
				//System.out.println();
				break;
			}

		}
		*/
		for (;true;){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Letter");
		double avg = sc.nextDouble() ;
		//double avg =69;
		System.out.println("Avg"+avg);
		
		if (avg>=70 && avg<=100){
			System.out.println("Destinction");
		}else if (avg>=60 && avg<=70){
			System.out.println("First Class");
						}
		else if (avg>=50 && avg<=60){
			System.out.println("Second Class");
						}
		else if (avg>=35 && avg<=50){
			System.out.println("Third Class");
						}else{
							System.out.println("Fail");
						}
		
	}
	}

}
