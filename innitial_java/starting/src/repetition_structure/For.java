package repetition_structure;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Ex1
		
		System.out.println("Type a number:");
		int number = sc.nextInt();
		
		for (int i = 1;i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
				
//		EX2 factorial
		System.out.println("Type an integer number:");
		int num = sc.nextInt();
		int factorial = num;
		
		for (int i = 1; i < num; i++) {
			factorial *= (num - i);
		}
		
		System.out.printf("The factorial of %s is %s", num, factorial);
		
//		EX3 Calculating divisors
		System.out.println("Type an integer number to see its divisors untill itself:");
		int n = sc.nextInt();
		
		for (int i = 1;i <= n;i++) {
			if (n % i == 0) {
				System.out.printf("The number is divided entirely by: %s \n", i);
			}
		}
		
		sc.close();
		
	}

}
