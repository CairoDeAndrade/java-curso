package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name, mail;
		Integer roomNumber;
		
		System.out.println("Here in the boarding house you can rent your room!");
		Integer rooms = 10;
		System.out.println("The total number of rooms is " + rooms);
		
		Student[] vect = new Student[rooms];
		System.out.println("Do you want to rent a room?(yes/no)");
		String answer = sc.next();
		if (answer.equals("yes")) {
			System.out.println("How many students will rent?");
			Integer num = sc.nextInt();
			
			for (int i = 0; i < num; i++) {
				System.out.println("Rent #" + (i + 1));
				System.out.print("Name: ");
				name = sc.next();
				System.out.print("Mail: ");
				mail = sc.next();
				System.out.print("Room number: ");
				roomNumber = sc.nextInt();
				
				vect[roomNumber] = new Student(name, mail);
			}
			
			int i = 0;
			System.out.println("busy rooms:");
			for (Student obj : vect) {
				if (obj != null) {
					i += 1;
					System.out.printf(i + ": %s, %s\n", obj.getName(),
					obj.getMail());
				}
			}
		}
		else {
			System.out.println("Ok, thank you for contacting us!");
		}
		
		sc.close();

	}

}
