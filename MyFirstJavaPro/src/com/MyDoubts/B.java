package com.MyDoubts;


import java.util.Scanner;

 
class bb
{
    void doCalc()
   {	
	switch(sc.next().charAt(0))
	{
	case '+':
	{
		add=num1+num2;
		System.out.println(add);
		break;
	}
	case '-':
		{
			sub=num1-num2;
			System.out.println(sub);
			break;
		}
	case '*':
		{
			multi=num1*num2;
			System.out.println(multi);
			break;
		}
	case '/':
		{
			div=num1/num2;
			System.out.println(div);
			break;
		}
	default:
		{
			System.out.println("invalid operator");
		}
	}
	    
    B obj =new B();
    obj.app();
}
	
}
 class B  
{
	    
	    
	    public void app () {
	  	  int num1,num2,add,sub,multi,div;
	  	  Scanner sc =new Scanner(System.in);
	  	
	  	 
	  	
	  	System.out.println("enter number:");
	  	num1=sc.nextInt();
	  	
	  	System.out.println("enter number:");
	  	num2=sc.nextInt();
	  	System.out.println("enter operator:");

	  	bb o = new bb(); 
	  	
	  	}
	   

	public static void main(String[] args) {
      System.out.println("apple");
	  bb ob = new bb();
 
		//obj1.getInput();
		//obj1.doCalc();
	}
	
}