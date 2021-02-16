package com.arrayhw;

public class FirstCaps12 {

	public static void main(String[] args) {
		
		char c[]={'h','a', 'r','i','h','a','r','a','n'};

		for (int i=0 ; i<c.length; i++){	
			
			if (c[0]>=97 && c[0]<=122)
			{
				c[0]= (char) (c[0]-32);
				
			}
			else if (c[0]>=97 || c[0]<=122)
			{
				c[0]= (char) (c[0]+32);
			}
        
       System.out.print(c[i]+" ");
	}
 
	}

}
