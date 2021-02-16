package com.MyDoubts;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Student
{
	String name,branch,rollNo;
	int sub1,sub2,sub3,sub4,sub5,sub6;
	float maxMark=600,totM;
	BranchCheck bc = new BranchCheck();
	Address ad = new Address();
	Result1 r1 = new Result1();
	boolean z=false;
	boolean checkMark(int mark)
	{
		if(mark>=0 && mark<=100)
		{
			z=true;
		}
		else
		{
				z=false;
			System.out.println("Invalid Mark!");
		}
		return z;
	}//End of method boolean()
	void calTotalMarks()
	{
		totM=sub1+sub2+sub3+sub4+sub5+sub6;
	}//End og method totalMark()
	
	void calPercentage()
	{
		r1.per=(totM/maxMark)*100;
	}//End of method percentage()
	void calResult()
	{
			if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5<35 || sub6<35)
			{
				r1.result="Fail";
			}//End of if block
			else 
			{
				if(r1.per>=70 && r1.per<=100)
				{
					r1.result="Distinction";
				}
				else if(r1.per>=60 && r1.per<=69)
				{
					r1.result="First Class";
				}
				else if(r1.per>=50 && r1.per<=59)
				{
					r1.result="Second Class";
				}
				else if(r1.per>=35 && r1.per<=49)
				{
					r1.result="Third class";
				}
				else if(r1.per>=0 && r1.per<=34)
				{
					r1.result="Fail";
				}
			}//End of else block
	}//End of method calResult()
	void getStudent()
	{
		System.out.println("====Student detail====");
		System.out.println("name:"+name);
		System.out.println("branch:"+branch);
		System.out.println("rollNo:"+rollNo);
	}//End of method getStudent()
	void getTotalMark()
	{
		System.out.println("===Total Marks===");
		System.out.println("totMarks:"+totM);
	}//End of method getTotalMark()
}//End of class Student
class BranchCheck
{
	boolean z=false;
	boolean checkBranch(String branch)
	{
		switch(branch)
		{
			case "CSE":
				z=true;
				break;
			case "ECE":
				z=true;
				break;
			case "EEE":
				z=true;
				break;
			default:
				System.out.println("Invalid Branch!");
				break;
		}
		return z;
	}
}//End of class BranchCheck
class Address
{
	String hNo,sN,city;
	int pinCode;
	void getAddress()
	{
		System.out.println("====Address Detail====");
		System.out.println("hNo:"+hNo);
		System.out.println("sName:"+sN);
		System.out.println("city:"+city);
		System.out.println("pinCode:"+pinCode);
	}//End of method getAddress()
}//End of class Address
class Result1
{
	float per;
	String result="null";
	void getPercentage()
	{
		System.out.println("===Percentage===");
		System.out.println("per:"+per);
	}//End of method getPercentage()
	void getResult()
	{
		System.out.println("===Result===");
		System.out.println("result:"+result);
	}//End of method getResult()
}//End of class Result1
class Read
{
	void readData(Scanner s,Student stu)
	{
		System.out.println("=====Reading Data=====");
		System.out.println("Enter Student Details");
		System.out.println("Enter the name:");
		stu.name=s.nextLine();
		xyz:
		while(true)
		{
			System.out.println("Enter the branch:");
		stu.branch=s.nextLine();
		boolean z=stu.bc.checkBranch(stu.branch);
		if(z==true)
			{
				break xyz;
			}
		}//End of loop
		System.out.println("Enter the rollNo:");
		System.out.println("RollNo must be 10 digits(AlphaNumeric)");
		stu.rollNo=s.nextLine();
		System.out.println("Enter Address Detail");
		System.out.println("Enter the hNo:");
		stu.ad.hNo=s.nextLine();
		System.out.println("Enter the sName:");
		stu.ad.sN=s.nextLine();
		System.out.println("Enter the city:");
		stu.ad.city=s.nextLine();
		System.out.println("Enter the pinCode:");
		stu.ad.pinCode=s.nextInt();
		System.out.println("====Enter the Marks===");
		l1:
		while(true)
		{
			System.out.println("Enter the sub1 mark:");
		stu.sub1=s.nextInt();
		boolean z=stu.checkMark(stu.sub1);
		if(z==true)
		{
			break l1;
		}
		}//End of loop
		l2:
		while(true)
		{
			System.out.println("Enter the sub2 mark:");
		stu.sub2=s.nextInt();
		boolean z=stu.checkMark(stu.sub2);
		if(z==true)
		{
			break l2;
		}
		}//End of loop
		l3:
		while(true)
		{
			System.out.println("Enter the sub3 mark:");
		stu.sub3=s.nextInt();
		boolean z=stu.checkMark(stu.sub3);
		if(z==true)
		{
			break l3;
		}
		}//End of loop
		l4:
		while(true)
		{
			System.out.println("Enter the sub4 mark:");
		stu.sub4=s.nextInt();
		boolean z=stu.checkMark(stu.sub4);
		if(z==true)
		{
			break l4;
		}
		}//End of loop
		l5:
		while(true)
		{
			System.out.println("Enter the sub5 mark:");
		stu.sub5=s.nextInt();
		boolean z=stu.checkMark(stu.sub5);
		if(z==true)
		{
			break l5;
		}
		}//End of loop
		l6:
		while(true)
		{
			System.out.println("Enter the sub6 mark:");
		stu.sub6=s.nextInt();
		boolean z=stu.checkMark(stu.sub6);
		if(z==true)
		{
			break l6;
		}
		}//End of loop
		stu.calTotalMarks();
		stu.calPercentage();
		stu.calResult();
	}//End of method readData()
}//End of class Read
class Display
{
	void displayData(Student stu)
	{
		System.out.println("=====Displaying Data=====");
		stu.getStudent();
		stu.ad.getAddress();
		stu.getTotalMark();
		stu.r1.getPercentage();
		stu.r1.getResult();
	}//End of method displayData()
}//End of class Display
public class assig
{
	public static void main(String[] args) 
	{
		Student stu = new Student();
		Scanner s = new Scanner(System.in);
		Read read = new Read();
		read.readData(s,stu);
		Display d = new Display();
		d.displayData(stu);
	}
}
