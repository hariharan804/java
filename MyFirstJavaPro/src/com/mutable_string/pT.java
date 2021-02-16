package com.mutable_string;

public class pT {

	public static void main(String[] args) {
	
	long bufferstartTime = System.currentTimeMillis();
	
	StringBuffer sb = new StringBuffer("java");
	
	for (int i=1; i<=10000000; i++){
		sb.append("java");
		
	}
long bufferendTime=System.currentTimeMillis();

long builderstartTime = System.currentTimeMillis();

StringBuilder s = new StringBuilder("java");

for (int i=1; i<=10000000; i++){
	s.append("java");
	
}
long builderendTime=System.currentTimeMillis();

System.out.println("Buffer "+(bufferendTime-bufferstartTime)+" ms");
System.out.println("Builder "+(builderendTime-builderstartTime)+" ms");

	}

}
