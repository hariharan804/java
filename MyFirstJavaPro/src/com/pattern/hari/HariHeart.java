package com.pattern.hari;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class HariHeart {
	
/*	 
	    
		public static void main(String arg[]) {
		    
		    // size = 10
		    int a, b, size = 10;

		   
		    for (a = size / 2; a <= size; a = a + 2) {
		        
		    
		    for (b = 1; b < size - a; b = b + 2)
		        System.out.print(" ");

		    
		    for (b = 1; b <= a; b++)
		        System.out.print("A");

		    
		    for (b = 1; b <= size - a; b++)
		        System.out.print(" ");

		    
		    for (b = 1; b <= a - 1; b++)
		        System.out.print("A");

		    System.out.print("\n");
		    }
 

		    for (a = size; a >= 0; a--) {
		        
		    // THE INVERTED TRIANGLE 
		    for (b = a; b < size; b++)
		        System.out.print(" ");

		    // THE BASE OF TRIANGLE
		    for (b = 1; b <= ((a * 2) - 1); b++)
		        System.out.print("V");

		    System.out.print("\n");
		    }
		}
}


*/
	public static void main(String arg[]) {
	
	 String tmp = "";
     for(int x = 0xDC00; x< 0xDF2B; x++){
     // I escaped the non-emojis.
       if(x == 0xDD3E){
           x = 0xDD50;
       }
       if(x == 0xDD68){
           x = 0xDDF8;
       }
       if(x == 0xDE50){
           x = 0xDE7F;
       }
       if(x == 0xDEC6){
           x = 0xDF2A;
       }
       tmp += "\uD83D" + (char)x;
     }
     for(int x1=0xDF00; x1< 0xDFF0; x1++){
       if(x1 == 0xDFCA){
           x1 = 0xDFE0; 
       }
       if(x1 == 0xDF21){
           x1 = 0xDF30;
       }
       tmp += "\uD83C" + (char)x1 ;
     }
     //country letters
     for(int x2=0xDDE6; x2<0xDE00; x2++){
       tmp += "\uD83C" + (char)x2;   
     }
     for(int x3=0xDD70; x3<0xDD9B; x3++){
       tmp += "\uD83C" + (char)x3;  
     }
     for(int x4=0x2648; x4<0x2654; x4++){
       tmp += (char)x4;
     }
     tmp += "\u231A\u231B\u23F3\u23F0\u23E9\u23EA\u23EB\u23EB";
     printout(tmp);
 }
 
 public static void printout(String param){
   // from Kirk Schafer's code
   try {
     OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-16");
    // String str = param;
     osw.write(param);
     osw.flush();
     osw.close();
   } catch(IOException error) {
     System.out.println(error);  
   }

 }              
 
 
 }
