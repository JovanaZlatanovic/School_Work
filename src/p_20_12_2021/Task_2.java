package p_20_12_2021;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		/*
		 * Write a program that has a defined array of N numbers and loads N numbers
		 * from the user and keeps them in string. After entering the numbers, calculate
		 * the sum of the array and display it at the end of the program.
		 * 
		 * Enter N: 5
		 *  Enter the number: 1
		 *  Enter the number: 2 
		 *  Enter the number: 3 
		 *  Enter the number: 4 
		 *  Enter the number: 5 
		 *  Sum: 15
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = s.nextInt();

		int sum = 0;

		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the number:");
			int number = s.nextInt();
			numbers[i] = number;

			sum = sum + numbers[i];
		}

		System.out.println("Sum: " + sum);

		s.close();

	}

}
