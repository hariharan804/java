package com.MyDoubts;

public class test {
	void n(int x){
		x=x-1;
		if(x>0){
			n(x);
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
		/*				
		int a[] = { 1,2,14, 46, 47, 86, 92, 52, 48, 36, 66, 85,99,100 };
		
		int sec=a[0];
		int lar=a[0];
		
		for (int i=0; i<a.length; i++){
			
			if (a[i]>lar){
				sec=lar;
				lar=a[i];
			}else if(a[i]>sec){
				sec=a[i];
			}
		}
		System.out.println(sec);
	int max=0;
		for( int i=0; i<a.length; i++){
			for ( int j=i+1; j<a.length; j++){
				if (max>a[i]){
				int tem = a[i];
				a[i]=a[j];
				a[j]=tem;
			}
			}
			System.out.println(a[i]);
		}
		
		
		int largest = a[0];
		int secondLargest = a[0];
		
		for (int i = 0; i < a.length; i++)
		{
		if (a[i]> largest)
		{
		 secondLargest = largest;
		  largest = a[i];
		 
		}
		else if (a[i] > secondLargest) {
		 secondLargest = a[i];
		}
		}
		System.out.println("Second largest number is: " + secondLargest);
		 
		
		*/
		
			
		  	String s = "   hi  i   am      hariharan       ";
		
		char c[]=s.toCharArray();
		String ss ="";
				
		for (int i=0; i<c.length; i++){
			
			if (c[i]>='a' && c[i]<='z'){
				ss=ss+c[i];
				
				if (c[i+1]==' '){
					ss=ss+" ";
				}
			}
			
		}
		System.out.println(ss);
		  
		/*	   
		   int a =5;
		for(int i=1; i<=a; i++){
			for (int j=a; j<i; j++ ){
				System.out.print("* ");
			}
			System.out.println();
		}
		
			
		test l = new test();
		l.n(11);
		
		String s ="aia ";
		
		char c[]=s.toCharArray();
		
		for (int i=0; i<c.length/2; i++){
			
			char tem = c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=tem;
		}
		String ss = String.valueOf(c);
		
		if (ss.equalsIgnoreCase(s)){
			System.out.println("Palindrom");
		}else{
			System.out.println("not p");
		}
		
			for (int num=2; num<=100; num++) {
		int sum =0;
		//int num= 5;
		
	for (int i=2; i<=num; i++){
			
			if (num%i==0){
				
				sum=sum+1;				
			}
		}
		
		if (sum!=1){
			System.out.println("not prime"+num);
		}else{
			System.out.println(" prime"+num);
		}
		}
			
		//int num = 2;
	     //int sum = 0;
			for (int i=2; i<=num; i++)
			{
				if (num%i==0)
				{
					sum =sum+1;
					//System.out.println(i);
				}
			}
				if (sum!=1)
					
				{
					System.out.println(num+"  not prime");
				}
				else
				{
					System.out.println(num+"  is a prime");
				}
			
	 
		int sum =0;
		 int num =28;
		
		for (int i=1; i<num; i++){
			if (num%i==0){
				sum=sum+i;
				
				System.out.println(sum);
				}
			
		}
		 */	
		
		int a[] = { 1,5,2,3};
		
		int lar =a[0];
		int sec =a[0];
		
		for (int i=0; i<a.length; i++){
			
			if (a[i]>lar){
				sec=lar;
				lar=a[i];
			}
			
			else if(a[i]>sec){
				
				sec=a[i];
			}
		}
		System.out.println(sec);
		
		//---------------
		
		String s1 ="803";
		
		//String x ="";
		
		char c1[]=s1.toCharArray();
		
		 for (int i=0; i<c1.length/2; i++){
			 
			 char te = c1[i];
			 c1[i]=c1[c1.length-i-1];
			 c1[c1.length-i-1]=te;
		 }
		 
		 String x =String.valueOf(c1);
		 
		 if (x.equals(s1)){
			 System.out.println("pali");
			 		 }else{
			 			 System.out.println("not pa;");
			 		 }

	}
}
