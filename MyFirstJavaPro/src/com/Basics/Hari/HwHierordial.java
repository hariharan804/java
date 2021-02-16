package com.Basics.Hari;

public class HwHierordial {
	
	void m()
	
	{
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		

		B abdc = new B();
				
				abdc.m();
				abdc.n();
				
		C xyz = new C();
		
		    xyz.m();
		    xyz.o();
	}

}

	

class B extends HwHierordial {
	
	
 void n()
  
 {
	 System.out.println("Hey");
 }
}

class C extends HwHierordial 
{
	void o()
	
	{
		System.out.println("helo");
	}
}