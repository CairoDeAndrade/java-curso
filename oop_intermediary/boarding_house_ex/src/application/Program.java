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
		Integer roomsNum = 10;
		System.out.println("The total number of rooms is " + roomsNum);
		
		Student[] vect = new Student[roomsNum];
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
			
			for (int i = 0; i < num; i++) {
				if (vect[i] != null) {
					System.out.print("busy rooms:");
					System.out.print(vect.getName());
				}
			}
		}
		
		sc.close();

	}

}
