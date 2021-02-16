package com.Scanner;

import java.util.Scanner;

public class ScanLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter User Name");	
	String userName = sc.next();
	System.out.println("Enter Pass");
	String userPass = sc.next();
	
	if (userName.equals("hari") && userPass.equals("1234")){
		System.out.println("Login Done.");
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 	
	else{
		System.out.println("User Name & Pass Worng");
	}
	
  }
}
