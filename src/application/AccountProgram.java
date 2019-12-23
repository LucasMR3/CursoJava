package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountProgram {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		String initialDeposit = sc.next();
		
		String yes = "y";
		
		double balance = 0.00;
		
		if (initialDeposit.equalsIgnoreCase(yes)) {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
				
		Account account = new Account(number, holder, balance);
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
