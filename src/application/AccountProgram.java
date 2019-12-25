package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account Number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account Holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		double balance = 0.00;

		if (response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			account = new Account(number, holder, balance);
		} else {
			account = new Account(number, holder);
		}

		System.out.println("\nAccount data: \n" + account);

		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("\nUpdated account data: \n" + account);

		sc.nextLine();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("\nUpdated account data: \n" + account);

		sc.close();
	}
}
