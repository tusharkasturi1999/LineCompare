package com.LineCompare;
import java.util.Scanner;
import java.lang.Math;

public class Linecompare {
	public static void main( String[] args ) {
		System.out.println("Welcome to Line Comparision");
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the value of x1");
	    int x1 = sc.nextInt();
	    System.out.println("x1 is: " + x1);
	    
	    System.out.println("Enter the value of y1");
	    int y1 = sc.nextInt();
	    System.out.println("y1 is: " + y1);
	 
	    System.out.println("Enter the value of x2");
	    int x2 = sc.nextInt();
	    System.out.println("x2 is: " + x2);
	    
	    System.out.println("Enter the value of y2");
	    int y2 = sc.nextInt();
	    System.out.println("y2 is: " + y2);
	    
	    int x3=(x2-x1);
	    int y3=(y2-y1);
	    double lengthOfaLine=Math.sqrt((Math.pow(x3, 2))+(Math.pow(y3, 2)));
	    System.out.println("length of Line 1 :" +lengthOfaLine);
	    
	    
		
	}

}
