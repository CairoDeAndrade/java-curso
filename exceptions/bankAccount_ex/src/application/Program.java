package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DepositException;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter tha account data: ");
		
		System.out.print("Number: ");
		Integer accountNumber = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		System.out.print("Deposit limit: ");
		Double depositLimit = sc.nextDouble();
		
		Account acc = new Account(accountNumber, holder, balance,
				withdrawLimit, depositLimit);
			
		try {
			System.out.println();
			System.out.println("Do you want to deposit or withdraw? (d/w)");
			char aswer = sc.next().charAt(0);
			if (aswer == 'd') {
				System.out.println("How much do you want to deposit?");
				Double amount = sc.nextDouble();
				
				acc.deposit(amount);
			}
			else {
				System.out.println("How much do you want to withdraw?");
				Double amount = sc.nextDouble();
				
				acc.withdraw(amount);
			}
			
			System.out.println(acc);
		}
		catch (DepositException e) {
			System.out.println("Error in deposit: " + e.getMessage());
		} 
		catch (WithdrawException e) {
			System.out.println("Error in withdraw: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error, try again!");
		}
		finally {
			sc.close();
		}
	}
}
