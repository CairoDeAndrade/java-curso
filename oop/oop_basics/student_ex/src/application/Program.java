package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Let's see your final grade!");
		System.out.printf("Enter your name: \n");
		String name = sc.next();
		
		System.out.printf("Enter your first grade(between 0 and 30): \n");
		student.grade1 = sc.nextInt();
				
		System.out.printf("Enter your second grade(between 0 and 35): \n");
		student.grade2 = sc.nextInt();
		
		System.out.printf("Enter your third grade(between 0 and 35): \n");
		student.grade3 = sc.nextInt();
		
		student.gradeChecking();
		
		System.out.printf("Final grade of %s is : %s", name, student.finalGrade());
		if (student.finalGrade() >= 60) {
			System.out.printf("Pass!");
		}
		else {
			System.out.println("Failed! You need " + student.missingGrade()
			+ " to pass");
		}
		
		sc.close();
	}

}
