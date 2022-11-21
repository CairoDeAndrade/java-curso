package vect_ex;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter how many numbers do you want to type: ");
		int num = sc.nextInt();
		
		double[] vect = new double[num]; 
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Enter a number: ");
			vect[i] = sc.nextDouble();
			}
		
		double biggestNum = vect[0];
		int biggestPosition = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > biggestNum) {
				biggestNum = vect[i];
				biggestPosition = i;
			}
		}
		
		System.out.printf("Biggest number typed: %.2f\n", biggestNum);
		System.out.printf("Position of the biggest number: %d\n", biggestPosition);

		
		sc.close();
	}

}
