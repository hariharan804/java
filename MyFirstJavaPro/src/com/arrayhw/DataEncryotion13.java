package com.arrayhw;

public class DataEncryotion13 {

	public static void main(String[] args) {
		//'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',  
		char c[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //  char c[]={'j','a','v','a'};
		for (int i=0 ; i<c.length; i++){	
			 		 
	        if (c[i]>=97 && c[i]<=121)
	            {			
		         c[i]=(char) (c[i]+1);
	            }
	        else
                if (c[i]==122)
	          {
            	   c[i]=(char) (c[i]-25);
	          }      
       System.out.print(c[i]+" " );
	}
 
	}

}
