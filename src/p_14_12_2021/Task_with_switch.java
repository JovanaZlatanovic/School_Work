package p_14_12_2021;

import java.util.Scanner;

public class Task_with_switch {

	public static void main(String[] args) {
// Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature, (operator je string i moze imati vrednosti +, - , *, /) racuna i ispisuje na
// ekranu odgovarajuci zbir, razliku,proizvod ili kolicnik za dva broja a i b uneta sa tastature.


		Scanner s = new Scanner(System.in);

		System.out.println("Unestite vrednost a: ");
		int a = s.nextInt();

		System.out.println("Unestite vrednost b: ");
		int b = s.nextInt();

		System.out.println("Unestite operator: ");
		String operator = s.next();


		switch (operator) {

		case "+":

			System.out.println("Rezultat: " + (a + b));
			break;

		case "-":
			System.out.println("Rezultat: " + (a - b));
			break;

		case "*":
			System.out.println("Rezultat: " + (a * b));
			break;

		case "/":
			System.out.println("Rezultat: " + (a / b));
			break;
			
		default:
			System.out.println("Operator nije prepoznat");
	break;
		}

	}

}
