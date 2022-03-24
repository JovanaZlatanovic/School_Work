package p_23_12_2021;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		/*
		 * Write a method that calculates the Kth degree of the number of the number N.
		 * K and N are the parameters of the function. If the method is called for N =
		 * 10, and K = 4 returns 10000.
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N:");
		double n = s.nextInt();

		System.out.println("Enter the K:");
		double k = s.nextInt();

		s.close();

		System.out.println(kNum(n, k));

	}

	public static double kNum(double n, double k) {
		double counter = Math.pow(n, k);
		return counter;

	}

}
