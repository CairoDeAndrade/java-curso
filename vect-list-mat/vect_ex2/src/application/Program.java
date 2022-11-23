package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people do you want to type?");
		Integer num = sc.nextInt();
		
		Person[] vect = new Person[num];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Name:");
			String name  = sc.next();

			System.out.println("Height:");
			Double height = sc.nextDouble();
			
			System.out.println("Age:");
			Integer age = sc.nextInt();
			
			vect[i] = new Person(height, age, name);
		}
		
		Double heightSum = 0.0;
		Integer underage = 0;
		for (int i = 0; i < vect.length; i++) {
			heightSum += vect[i].getHeight();
			if (vect[i].getAge() < 18) {
				underage += 1;
			}
		}
		
		Double avgHeight = heightSum / vect.length;
		Double underagePercent = underage * 100.0 / vect.length;
		System.out.printf("Avarage height: %.2f\n", avgHeight);
		System.out.printf("Underage percentage: %.1f%%\n", underagePercent);

		
		sc.close();

	}

}
