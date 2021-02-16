package com.MyDoubts;

public class sumofdig {

	public static void main(String[] args) {
		
		int []a={1,2,8,4,6,7,9};
		
		 
		
		for (int i=0; i<a.length; i++){
			for (int j=i+1; j<a.length; j++){
				
			
			if (a[i]>a[j]){
				int min=a[i];
				a[i]=a[j];
				a[j]=min;
			}
			}
			System.out.println(a[i]);	
		}
		
	 	
		/*	int num =33331;
		int no=0, sum=0;
		
		
		
		while(num>0){
			
			no=(num%10);
			
			sum=sum+no;
			 
			 num=(num/10);
			System.out.println("no "+no);
			 
		}
		System.out.println(sum);
		
		
			//print one by number 
		
		int num =3097;
		int no, sum=0;
		
		while(num>0){
			
			no=(num%10);
			 
			sum=(sum*10)+no;
			
			 num=(num/10);
			 
			 System.out.println(no);
		}
		  
	
		 
		//revers number
		
		int num =3097;
		int no, sum=0;
		
		while(num>0){
			
			no=(num%10);
			System.out.println(no);
			 
			num=(num/10);
		}
		 
		
			
		  int a = 34;
	        int b = 21;
	        int c = a++ + ++b;
	        System.out.println("c= "+c);
	        int d = --a + --b + c--;
	        System.out.println("d = " + d);
	        int e = a + +b + +c + d--;
	        System.out.println("e = " + e);
	        int f = -a + b-- + -c - d++;
	        System.out.println("f = " + f);
	        int sum = a + b + c + d + e + f;
	        System.out.println("sum = " + sum);
	        
	        int x =5;
	        int y=x++ + ++x+x;
	        
	        System.out.println(x);
	        System.out.println(y);
	        
	        int z=8;
	        int aa=z++ + --z- ++z;
	        System.out.println(z);
	        System.out.println(aa);
	        
	        int mm =5;
	        		
	        	int hh=mm++;
	        	
	        	System.out.println(hh);
	        	
	        	*/
		
		
		
		
	}

}
