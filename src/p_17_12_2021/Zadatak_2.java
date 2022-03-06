package p_17_12_2021;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Write a program for a real estate agency. It is necessary to calculate the
		 * monthly salary of workers so that for each: sell the apartment, the worker
		 * has 3% sell shop, worker has 2% sold land, worker has 1% The user enters the
		 * name of the worker as well as the number of sales he made in the previous
		 * month. For each sale, enter the figure achieved during the sale as well as
		 * the type. At the end of the program, print the worker's salary.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Name: ");
		String name = s.next();

		System.out.println("Number of sales: ");
		int n = s.nextInt();

		int earnings = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Type of sale:");
			String type = s.next();
			System.out.println("Sales price:");
			int price = s.nextInt();

			switch (type) {
			case "apartment":
				earnings = earnings + price * 3 / 100;
				break;

			case "shop":
				earnings = earnings + price * 2 / 100;
				break;

			case "land":
				earnings = earnings + price * 1 / 100;
				break;

			default:
				System.out.println("Wrong entry!");
				break;
			}
		}
		System.out.println(name + " with " + n + " sales achieved " + earnings + "e");
	}
}
