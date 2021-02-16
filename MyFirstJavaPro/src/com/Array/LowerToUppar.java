package com.Array;

public class LowerToUppar {

	public static void main(String[] args) {
		char c[]={'h','a', 'R','i','h','a','r','a','n'};
		 
		for (int i=0 ; i<c.length; i++){	
				
			if (c[i]>=65 && c[i]<=90)
			{
				c[i]= (char) (c[i]+32);
				
			}	
			else
			
          if (c[i]>=97 && c[i]<=122)
            {
	         c[i]=(char) (c[i]-32);
            }
			
        
       System.out.print(c[i]+" ");
	}
 

}
	
}	
