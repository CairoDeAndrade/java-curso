package repetition_structure;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Ex1
//		
//		System.out.println("Type a number:");
//		int number = sc.nextInt();
//		
//		for (int i = 1;i <= number; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
//				
//		EX2 factorial
		System.out.println("Type an integer number:");
		int num = sc.nextInt();
		int factorial = 0;
		
		for (int i = 1; i < num; i++) {
			factorial += num * i;
		}
		
		System.out.printf("The factorial of %s is %s", num, factorial);
		
		sc.close();
		
	}

}







