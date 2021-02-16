package com.strings.hw;

public class FindNum {

	public static void main(String[] args) {

String a = "Parent 1";
String b = "child 2";
String c = "GrandFather 3";

char d[]=new char [a.length()+b.length()+c.length()];

for (int i=0; i<a.length(); i++){
	d[i]=a.charAt(i);                               
	if (d[i]>=48 && d[i]<=57){
		System.out.println(d[i]);
	}
}

	//System.out.println(d[i]);
	for (int j=0; j<b.length(); j++){
		d[j]=b.charAt(j);
		if (d[j]>48 && d[j]<=57){
			System.out.println(d[j]);
		}
	}
		for (int k=0; k<c.length(); k++){
			d[k]=c.charAt(k);
		
	
	if (d[k]>48 && d[k]<=57){
		System.out.println(d[k]);
	}
}
	}
	
}
