package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.println("How many tax payers?");
		Integer n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("What type of payer is? Individual or Company(i/c)");
			char type = sc.next().charAt(0);
			
			System.out.println("Payer #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.println("Annual health expenses: ");
				Double healthExpenses = sc.nextDouble();
				
				taxPayers.add(new Individual(name, annualIncome, healthExpenses));
			}
			else if (type == 'c') {
				System.out.println("Employees quantity: ");
				Integer employeeesQuantity = sc.nextInt();
				
				taxPayers.add(new Company(name, annualIncome, employeeesQuantity));
			}
			else {
				System.out.println("Error! The types of tax payers"
						+ " must be between Individual or Company(i/c)");
			}
		}
		
		System.out.println("SUMMARY:");
		Double totalIncome = 0.0;
		for (TaxPayer payer : taxPayers) {
			System.out.println(payer.toString());
		
			totalIncome += payer.incomeTax();
		}
		System.out.println("Total income earned: $ " + String.format("%.2f", totalIncome));
		
		sc.close();
	}

}
