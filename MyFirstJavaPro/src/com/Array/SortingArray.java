package com.Array;

public class SortingArray {

	public static void main(String[] args) {
		
/*		int a[]={5,4,3,2,1,9,11};
		
for (int i=0; i<a.length; i++)
{
	for (int j=i+1; j<a.length;j++)
	{
		System.out.println(a[i]+"-"+a[j]);
	}
}

*/
		
		// Assending or Decending programe
		
		int a[]={5,4,3,2,1,9,11};
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i] > a[j])
				{
					int temp =a[i];
					a[i]=a[j];
				 	a[j]=temp;
					
				}
				
				
			}
			
				System.out.println(a[i]);
		}

	
	}

}
