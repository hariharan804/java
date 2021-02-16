package com.constructor;

public class employe {
	
	int empId;
	double salary;
	String name;
	
	public static void main(String[] args) { 
		employe a1 =new employe ();
		employe a2 = new employe();
		
		System.out.println(a1.name);
		System.out.println(a2.name);
		System.out.println(a1.salary);
		System.out.println(a2.salary);
	}
}
