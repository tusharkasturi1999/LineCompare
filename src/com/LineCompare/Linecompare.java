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
	    double lengthOfaLine1=Math.sqrt((Math.pow(x3, 2))+(Math.pow(y3, 2)));
	    System.out.println("length of Line 1 :" +lengthOfaLine1);
	    
	    System.out.println("Enter the value of x4");
	    int x4 = sc.nextInt();
	    System.out.println("x4 is: " + x4);
	    
	    System.out.println("Enter the value of y4");
	    int y4 = sc.nextInt();
	    System.out.println("y4 is: " + y4);
	 
	    System.out.println("Enter the value of x5");
	    int x5 = sc.nextInt();
	    System.out.println("x5 is: " + x5);
	    
	    System.out.println("Enter the value of y5");
	    int y5 = sc.nextInt();
	    System.out.println("y5 is: " + y5);
	    
	    int x6=(x5-x4);
	    int y6=(y5-y4);
	    double lengthOfaLine2=Math.sqrt((Math.pow(x6, 2))+(Math.pow(y6, 2)));
	    System.out.println("length of Line 2 :" +lengthOfaLine2);
	    
	    if(lengthOfaLine1 == lengthOfaLine2) {
	    	System.out.println("Length of two lines are Equal");
	    }
		
	}

}
