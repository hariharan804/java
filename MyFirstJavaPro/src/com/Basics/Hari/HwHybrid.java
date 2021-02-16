package com.Basics.Hari;

public class HwHybrid {

void m()
	
	{
		System.out.println("H1");
	}
	
	public static void main(String[] args) {
		

		//B abdc = new B();
				
				//abdc.m();
				//abdc.n();
				
		C xyz = new C();
		
		    xyz.m();
		    xyz.o();
	}

}

	

class B extends HwHybrid {
	
	
 void n()
  
 {
	 System.out.println("H2");
 }
}

class C extends HwHybrid 
{
	void o()
	
	{
		System.out.println("h3ff nb");
	}
}