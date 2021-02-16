package com.Array;

public class Array10Midlenumber {
 
		
		void even() {
		
		int a[]={7,7,5,9,8,6 };
				
				for (int i=0; i<a.length; i++)
				
				{
					System.out.print("");
				}
				
				System.out.print("Even "+a[a.length/2]+","+a[a.length/2-1]);
			}
		
			void oddd()
			{
			
			int a[]={7,7,5,7,7,8,6 };
			
			for (int i=0; i<a.length; i++)
			
			{
				System.out.print("");
			}
			
			System.out.print("  odd "+a[a.length/2]);
			
			

		}



	public static void main(String[] args) {
		
		
		Array10Midlenumber one = new Array10Midlenumber ();
		
		  one.even();
		  one.oddd();
		
	}	
	

	
}


	