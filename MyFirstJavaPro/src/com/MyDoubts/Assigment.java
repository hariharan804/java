package com.MyDoubts;

import java.util.Scanner;


	
  void read()
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name:");
	String a=sc.next();
	
	
	Scanner br=new Scanner(System.in);
	System.out.println("enter branch:");
	String b=br.next();
	
	if((b.equalsIgnoreCase("ECE")||b.equalsIgnoreCase("CSE"))||(b.equalsIgnoreCase("EEE")))
	{
		
		Scanner rn=new Scanner(System.in);
		System.out.println("enter rollno:");
		String c=rn.next();
		if(c.length()==10)
		{
			//System.out.println("valid");
			Scanner dl=new Scanner(System.in);
			System.out.println("enter city:");
			String d=dl.next();
			System.out.println("enter pincode:");
			String e=dl.next();
			
			
			for(int i=0;i<=6;i++)
			{
				int sum =0;
				Scanner sm=new Scanner(System.in);
				System.out.println("enter marks:");
				int mark=dl.nextInt();
				 sum  += mark;
				 
				 
			
			}
			
		}
		else{
			System.out.println("not valid");
		}
	}
	else
	{
		System.out.println("not valid");
	}
	
	 }  
	
	
	void read()
	 {
	
	Assigment a =new Assigment();
	String name="";
	 String rollNo ="";
	 String branch="";
	 String city="";
	 String pincode="";
	 int sum=0;
	 double avg=0;
	 String Result ="";
	 
	  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name");
	  name = sc.next();
	//System.out.println(name);
	
	System.out.println("Enter Branch");
	 branch = sc.next();
	
	if (branch.equalsIgnoreCase("css") || branch.equalsIgnoreCase("ece") || branch.equalsIgnoreCase("eee")){
	//System.out.println(branch);
	
	System.out.println("Enter Rollno:");
	  rollNo=sc.next();
	if(rollNo.length()==10){
	
	//System.out.println(rollNo);
		
		
		System.out.println("Enter city:");
		 city=sc.next();
		System.out.println("Enter Pincode:");
		 pincode=sc.next();
		
		
		
		for(int i=1;i<=6;i++)
		{
			
		 
			System.out.println("enter marks:");
			int mark=sc.nextInt();
			 sum +=mark;
		 
		//System.out.println(sum);
		 avg =sum/6;
		//System.out.println("Avg"+avg);
	}	
		if (avg>=70 && avg<=1100){
			Result ="Destinction";
			//System.out.println("Destinction");
		}else if (avg>=60 && avg<=70){
			Result ="First Class";
			//System.out.println("First Class");
						}
		else if (avg>=50 && avg<=60){
			Result ="First Class";
			//System.out.println("First Class");
						}
		else if (avg>=35 && avg<=50){
			
			Result ="Third Class";
			System.out.println("Third Class");
						}else{
							Result ="Fail";
							//System.out.println("Fail");
						}
		
		System.out.println("Name: "+name);
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Branch :"+branch);
		System.out.println("City :"+city);
		System.out.println("PIN Code :"+pincode);
		System.out.println("Total Mark :"+sum);
		System.out.println("Avarage Mark :"+avg);
		System.out.println("Result :"+Result);
		
	}else{
		System.out.println("not valid");
		
	}
	
	} 
	else{
		System.out.println("not valid");
	}}
	 
	  
	
class boys{
	 void detials(){
	String name,branch,rollNo;
	int sub1,sub2,sub3,sub4,sub5,sub6;
	float maxMark=600,totM;
	BranchCheck bc = new BranchCheck();
	Address ad = new Address();
	Result1 r1 = new Result1();
	boolean z=false;
System.out.println(maxMark);
		
	}
	
}
	
public class Assigment {
	public static void main(String[] args) {
		
		Assigment a = new Assigment();
		boys b =new boys();
		 //a.read();
		b.detials();
	}		
  }
}

