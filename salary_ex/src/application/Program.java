package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's see how is your salary!");
		System.out.print("Enter your name: ");
		
		Employee employee = new Employee();
		employee.name = sc.next();
		
		System.out.print("Enter your gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Enter the tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s has %.2f of salary \n",
				employee.name, employee.netSalary());
		
		System.out.printf("It seems you have been promoted! \n"
				+ " Enter the percetage of the increasing: ");
		double percentage = sc.nextDouble();
		
		System.out.printf("\nUpdated data: Employee: %s has %.2f of salary \n",
				employee.name, employee.increaseSalary(percentage));
		
		sc.close();
	}

}
