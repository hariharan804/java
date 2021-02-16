package com.Basics.Hari;

public class Inheritance {
	
	void m()
	{
	System.out.println("hiii");
	
	}

	public static void main(String[] args) {

		Abc abdc = new Abc();
				
				abdc.m();
				abdc.n();
				
		Xyz xyz = new Xyz();
		
		    xyz.m();
		    xyz.o();
	}

}

class Abc extends Inheritance {
	void n()
	{
	System.out.println("Helo");
	
	}
}

class Xyz extends Inheritance {
	
	void o()
	{
	System.out.println("Tq");
	
	}
	
	
}
