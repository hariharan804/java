package com.strings;
public class AaConvert {
	public static void main(String[] args) {
		
		/*
		int a = 55;
		String b=String.valueOf(a);
		System.out.println("Int to str "+b);
		
		//str to int 
		
		String c ="554";
		int d =Integer.parseInt(c);
	    System.out.println("Str to int "+d);
	    
	    //Dou to str
	    
	    double e = 77.9;
	    String f =String.valueOf(e);
	    System.out.println("Dou to str "+f);
	    
	    //Str to dou
	    
	    String g ="43.56";
	    double h =Double.parseDouble(g);
	    System.out.println("Str to dou "+h);
	    
	    //Str to char Array
		
	    String i = "apple ball cat dog";
	    char[] j =i.toCharArray();
	    System.out.println(j);
	    
	  
	    
	    //Char to Str
	    
	    char k[] = {'a','z'};
	    String l =String.valueOf(k);
	    System.out.println("Char to Str=> "+l);
	     */
	    //Str Array to Str
	    
	    String []m ={"re","te","ree"};
	    String oo="";
	     
	    for (int w=0; w<m.length; w++){
		 
 // String o = String.valueOf(m);
	    	oo+=m[w]+" ";
		  }
	    System.out.println(oo);
		//Str to Str Array
		
		String p ="apple ball cat dog";
		String[] st  = new String[] {p, "name1", "name2"};
		String q[]=p.split(" ");
		for (int i1=0; i1<st.length; i1++){
			{
		 System.out.println(st[i1]);
		}
		}
	}
}
