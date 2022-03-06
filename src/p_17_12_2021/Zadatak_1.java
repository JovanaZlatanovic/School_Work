package p_17_12_2021;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji od korisnika ucitava stanje na racunu a zatim sa racuna
		 * skida dok god ima sredstava za transakciju. U slucaju da nema dovoljno
		 * sredstava ispisati odgovarajucu gresku. Primer izvrsenja: Unesite stanje na
		 * racunu: 100 Na racunu imate $100, Unesite sumu za sledecu transakciju: 50 Na
		 * racunu imate $50, Unesite sumu za sledecu transakciju: 31 Na racunu imate
		 * $19, Unesite sumu za sledecu transakciju: 20 Nemate dovoljno sredstava na
		 * racunu.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite stanje na racunu:");
		int stanje = s.nextInt();

		System.out.println("Unesite transakciju:");
		int transakcija = s.nextInt();

		while (stanje >= transakcija) {
			stanje = stanje - transakcija;
			System.out.println("Na racunu imate $" + stanje + ", unesite sumu za sledecu transakciju");
			transakcija = s.nextInt();
		}

		System.out.println("Nemate dovoljno sredstava na racunu. ");

	}

}


