package com.mutable_string;

public class sBuff {

	public static void main(String[] args) {

   StringBuffer sb = new StringBuffer("java");
   
   sb.append("py");
   //sb.reverse();
  sb.replace(0,1,"va");
   sb.delete(1,2);
   System.out.println(sb);
	}

}
