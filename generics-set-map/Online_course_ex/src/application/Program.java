package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		Set<Integer> studentsSet = new HashSet<>();
		
		System.out.println("How many courses does the instructor give?");
		int coursesNum = sc.nextInt();
		
		for (int i = 1; i <= coursesNum; i++) {
			System.out.println("How many students in the course " + i + "?");
			n = sc.nextInt();
			
			System.out.println("Enter the id of the " + n + " students:");
			for (int j = 0; j < n; j++) {
				Integer studentId = sc.nextInt();
				studentsSet.add(studentId);
			}
		}
		
		System.out.println("Total quantity of students: " + studentsSet.size());
		
		sc.close();
	}

}
