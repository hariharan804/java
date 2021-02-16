package com.stringstest;
public class PrintWthoutLoop1 {
	
	void m(int x){
		
		
		x=x-1;
		if (x>=0){
			m(x);
			System.out.print(x);
		}
		
	}
public static void main(String[] args) {
	PrintWthoutLoop1 obj = new PrintWthoutLoop1 ();
	obj.m(11);
	
	}}