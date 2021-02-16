package com.strings;

public class mystrings1 {  
	 
	public static void main(String []  args){
		
		String s= "java hari";
		
		System.out.println("1. "+s.length());
		System.out.println("2. "+s.substring(2));	
		System.out.println("3. "+s.substring(2,5));
		System.out.println("4. "+s.concat("haran"));
		System.out.println("5. "+s.charAt(7));
		System.out.println("6. "+s.indexOf("h"));
		System.out.println("7. "+s.lastIndexOf("i"));
		System.out.println("8. "+s.equals("hari"));
		System.out.println("9. "+s.equalsIgnoreCase("java HARI"));
		System.out.println("10. "+s.contains("java"));
		System.out.println("11. "+s.startsWith("a"));
		System.out.println("12. "+s.endsWith("i"));
		System.out.println("13. "+s.toUpperCase( ));
		System.out.println("14. "+s.toLowerCase( ));
		System.out.println("15. "+s.isEmpty( ));
		System.out.println("16. "+s.trim(  ));
		System.out.println("17. "+s);
		
		System.out.println(String.valueOf(s));
		
	}
	
}
