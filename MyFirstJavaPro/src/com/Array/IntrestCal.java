package com.Array;

public class IntrestCal {

	public static void main(String[] args) {

	double	p=10000;
	double  n=12;
	double r=7.5 ;

		//System.out.println(Math.pow((1+r/100),n)*p);
		
		double x=1+r/100;
		double y=Math.pow(x,n);
		double ci=p*y;
		
		System.out.println(ci);		
	}

}
