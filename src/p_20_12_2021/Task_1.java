package p_20_12_2021;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		/*
		 * Write a program that has a defined array of 10 numbers (numbers are
		 * arbitrary) and which changes the value of the element at position K. K and
		 * the new value is entered by the user. Example: Enter a position from 0 to 9:
		 * 3 Enter a new value: 11 The element in position 3 should end up with a value
		 * of 11 in your program.
		 */

		Scanner s = new Scanner(System.in);

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Enter position from 0 to 9:");
		int k = s.nextInt();

		System.out.println("Enter novu value:  ");
		int x = s.nextInt();

		numbers[k] = x;

		System.out.println(
				"Element at the " + k + ".position in the end should has value " + numbers[k] + " in your program.");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
