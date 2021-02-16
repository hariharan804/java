package com.pack1;

public class BacicProgram {
	
	void Factorial(){
		int num =5;
		int out  =1;
		
		for(int i=1; i<=num; i++){
			out = out * i;
		 }
		System.out.println(out);
	}
	
	void NaturalNumbers() {
		
		int num = 5;
		int out = 0;
		
		for (int i=1; i<num; i++){
			out=out*i;
		}
		System.out.println(out);
	}

	public static void main(String[] args) {
		 
		BacicProgram b = new  BacicProgram();
		b.Factorial();
		b.NaturalNumbers();
		

	}

}
