package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;

		System.out.println("Register your bank account here!");
		System.out.print("Enter your account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.printf("Enter your name: ");
		String name = sc.next();
		
		System.out.printf("Do you want to make an innitial deposit?(yes/no)");
		String answer = sc.next();

		if (answer.equals("yes")) {
			System.out.println("Enter how much you want to deposit innitialy: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, name, initialDeposit);
		}
		else {
			bankAccount = new BankAccount(accountNumber, name);
		}
		System.out.println(bankAccount);
		
		System.out.println("Do you want to make a deposit?(yes/no)");
		answer = sc.next();
		if (answer.equals("yes")) {
			System.out.println("Enter how much you want to deposit: ");
			double quantity = sc.nextDouble();
			bankAccount.deposit(quantity);
		}
		System.out.println(bankAccount);
	
		System.out.println("Do you want to make a withdraw?(yes/no)");
		answer = sc.next();
		if (answer.equals("yes")) {
			System.out.println("Enter how much you want to withdraw: ");
			double quantity = sc.nextDouble();
			bankAccount.withdraw(quantity);
		}
		System.out.println(bankAccount);

		sc.close();
	}

}
