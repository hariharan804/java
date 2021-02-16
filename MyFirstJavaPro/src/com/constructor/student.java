package com.constructor;

public class student {
	
	int rollNo;
	double total;
	String name;
	char grade;
	

	public student(int rollNo, double total, String name, char grade) {
		 
		this.rollNo = rollNo;
		this.total = total;
		this.name = name;
		this.grade = grade;
	}

	public static void main(String[] args) {
		
		student s1 = new student (1,97.0,"Hari",'A');
		student s2 = new student (2,99.0,"pream",'B');
		
		//student s = (student) s1.clone();
				
		
				
				System.out.println(s1.grade);
		
	}

}
