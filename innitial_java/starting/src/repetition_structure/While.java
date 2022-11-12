package repetition_structure;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
//		while
		System.out.println("Type the password:");
		int password = sc.nextInt();

		while (password != 123) {
			System.out.println("Invalid password!");
			password = sc.nextInt();
		}
		
		System.out.printf("Welcome %s \n", password);
		
//		Do-While
		char option;
		
		do {
			System.out.print("Type the temperature in degrees:");
			double Celsius = sc.nextDouble();
			double Fahrenheit = 9 * Celsius / 5 + 32;
			
			System.out.printf("The equal value in Fahrenheit is %.1f \n", Fahrenheit);
			System.out.println("Do you want to repete the action? (y/n)");
			option = sc.next().charAt(0);
		} while (option != 'n');
		
		sc.close();
	}

}
