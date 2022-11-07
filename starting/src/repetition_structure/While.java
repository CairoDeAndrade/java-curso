package repetition_structure;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Type the password:");
		int password = sc.nextInt();

		while (password != 123) {
			System.out.println("Invalid password!");
			password = sc.nextInt();
		}
		
		System.out.printf("Welcome %s \n", password);
	}

}
