package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/* Calculating the area of the triangles
		 * using OOP to make a Triangle an entity */
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the three sides of the first triangle:");
		x.side1 = sc.nextDouble();
		x.side2 = sc.nextDouble();
		x.side3 = sc.nextDouble();

		System.out.println("Enter the three sides of the second triangle:");
		y.side1 = sc.nextDouble();
		y.side2 = sc.nextDouble();
		y.side3 = sc.nextDouble();
		
		double areaX = x.triangle_area();
		double areaY = y.triangle_area();

		
		System.out.printf("The area of the first triangle is: %.2f \n", areaX);
		System.out.printf("The area of the second triangle is: %.2f \n", areaY);
		
		if (areaX > areaY) {
			System.out.println("The first triangle is larger!");
		}
		else if (areaY > areaX) {
			System.out.println("The second triangle is larger!");
		}
		else {
			System.out.println("The first triangle and the second one are equal!");
		}
		
		sc.close();
		
	}

}







