package com.constructor;

 class studentw {
 
	 int rollNo;
	   double total;
	  String name;
	   char grade;
	static String collage = "nbb";
	

	
	public studentw(int rollNo, double total, String name, char grade) {
	 
		this.rollNo = rollNo;
		this.total = total;
		this.name = name;
		this.grade = grade;
		
		 //a = new studentw(rollNo, total, name, grade);
	 call();
	 
	}
	     void call(){
		System.out.println(rollNo); 
		System.out.println(total); 
		System.out.println(name);
		
	}
	
	
	
}

public class NewConstructor {
	
	

	public static void main(String[] args) {
		 
		studentw s1 = new studentw(232,5.0,"hari",'a');
		studentw s2 = new studentw(232,5.0,"harihar",'a');
		studentw s3 = new studentw(232,5.0,"hari",'a');
		
		//System.out.println(s1.collage);
	}

}
