package p_23_12_2021;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		/*
		 * Write a method that prints whether it is possible to transfer funds from one
		 * account to another. From the parameters are entered: the number of the
		 * account from which the funds are sent the number of the account to which the
		 * funds are sent Balance on the account from which it is sent Amount A
		 * commission of 5% is charged for the transfer of funds. If there are enough
		 * funds to withdraw, "Transaction is possible"
		 * otherwise"Transaction is not possible"
		 * 
		 * Call example: If 840-23923-23, 840-32923-232, account balance 100, amount 20
		 * is entered. Transactions are possible If 840-23923-23, 840-32923-232, balance
		 * 100, amount 100 is entered. Transactions are not possible. Explanation:
		 * Because with the commission, it turns out 105!
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your account number: ");
		String accountNumber1 = s.next();

		System.out.println("Enter the account number to which the funds will be sent: ");
		String accountNumber2 = s.next();

		System.out.println("Enter your account status: ");
		int status = s.nextInt();

		System.out.println("Enter the amount to send: ");
		int amount = s.nextInt();

		transaction(accountNumber1, accountNumber2, status, amount);

	}

	public static void transaction(String accountNumber1, String accountNumber2, int status, int amount) {
		double commission = amount * 0.05;
		if (status >= amount + commission) {

			System.out.println("Transaction is possible.");
		} else {
			System.out.println("Transaction not possible.");
		}

	}

}
