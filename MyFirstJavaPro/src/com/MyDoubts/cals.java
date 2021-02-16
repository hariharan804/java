package com.MyDoubts;

import java.util.Scanner;

public class cals {

	  public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter two numbers 1: ");

	    double first = sc.nextDouble();
	    System.out.print("2nd Num : ");
	    double second = sc.nextDouble();

	    System.out.print("Enter an operator (+, -, *, /): ");
	    char operator = sc.next().charAt(0);

	    double result;

	    switch (operator) {
	      case '+':
	        result = first + second;
	        break;

	      case '-':
	        result = first - second;
	        break;

	      case '*':
	        result = first * second;
	        break;

	      case '/':
	        result = first / second;
	        break;

	      default:
	        System.out.printf("Error! operator is not correct");
	        return;
	    }

	    System.out.println(first + " " + operator + " " + second + " = " + result);
	  }
	}