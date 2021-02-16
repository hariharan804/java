package com.MyDoubts;

public class OtpChar {

	public static void main(String[] args) {
		/* 
		for (int i=1; i<10; i++){
			
			int a =  (int) Math.round(Math.random()*100);
			 char b = (char) a;
			 
			
			System.out.println(b+""+""+b);

		}
		int a=65;  
		char c=(char)a;  
		System.out.println(c);
		
		*/
		
		String s ="";
		int count =0;
		while(count !=5)
		{
			char c  = (char) Math.round(Math.random()*100);
		
		if(c>=65 && c<90 || c>=97 && c<122){
			s+=c;
			count=count + 1;
		}
		}
		System.out.println(s);
	}

}
