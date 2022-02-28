package p_16_12_2021;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

//		Write a program that simulates printing a read document in multiple copies.

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first and last name:");
		String fullName = s.next();
		System.out.println("Enter your id:");
		String id = s.next();
		System.out.println("Enter the number of copies to print:");
		int numberOfCopies = s.nextInt();

		for (int i = 1; i <= numberOfCopies; i++) {
			System.out.println();
			System.out.println("Number " + i);
			System.out.println("**********************************");
			System.out.println("Full name: " + fullName);
			System.out.println("ID " + id);
			System.out.println("**********************************");
			System.out.println();

		}

	}

}
