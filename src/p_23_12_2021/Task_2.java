package p_23_12_2021;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		/* Write a method that takes the sides of a triangle (a, b, c) as parameters
		 *  and returns information if the triangle is rectangular. 
		 *  A triangle is right if a * a + b * b = c * c
		 *  
		 *  Example method call:
		 *  if the rectangle for a = 1, b = 2, c = 4, returns false
		 *  if the rectangle for a = 3, b = 4, c = 5, returns true
		 *  In the main program, use the information returned by the method for printing 
		 *  the message whether the triangle is rectangular.
		 *  Messages that print should be either "Triangle is rectangular" 
		 *  or "Triangle is not rectangular" */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the a:");
		int a = s.nextInt();
		
		System.out.println("Enter the b:");
		int b= s.nextInt();
		
		System.out.println("Enter the c:");
		int c = s.nextInt();
		
		s.close();

		boolean x = isRectangular(a,b,c);
		if (isRectangular(a,b,c)) {
			System.out.println("Triangle is rectangular.");
		} else {
			System.out.println("TrTriangle is not rectangular.");
		}
	}
	
	public static boolean isRectangular(int a, int b, int c) {
		return a * a + b * b == c * c;		
		
		
	}

}
