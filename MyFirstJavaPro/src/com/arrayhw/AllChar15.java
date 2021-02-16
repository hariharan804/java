package com.arrayhw;

public class AllChar15 {

	public static void main(String[] args) {
		 
		char c[]={'1','3','4','5','9','a','b','c','D','F','.','#','*','-'};
		
		int countnum =0;
		int countchar =0;
		int countsplchar =0;
		//int count =0;
		
		for (int i=0; i<c.length; i++){
			
			if (c[i]<=57 && c[i]>=48)
			
			//System.out.print(" " +c[i]+" ");
			countnum=countnum+1;
			
		    }System.out.println("numbers count=> "+countnum);
		    
		for (int i=0; i<c.length; i++){
           if (c[i]<=122 && c[i]>=65)
        	   countchar=countchar+1;
			//System.out.print(" " +c[i]+" ");
           
	}System.out.println("char count => "+countchar);
	
		for (int i=0; i<c.length; i++){
			if (c[i]<=47 && c[i]>=32)
				
				//System.out.print(" " +c[i]+" ");
			countsplchar=countsplchar+1;
			
		}System.out.println("char spl count => "+countsplchar);
		
	}
}
