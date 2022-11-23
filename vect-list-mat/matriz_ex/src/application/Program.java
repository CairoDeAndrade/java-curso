package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's make a matriz!");
		System.out.println("Enter the number of lines:");
		Integer linesNumber = sc.nextInt();
		
		System.out.println("enter the number of columns:");
		Integer columnsNumber = sc.nextInt();
		
		Integer[][] mat = new Integer[linesNumber][columnsNumber];
		
		System.out.println("Enter the numbers you want to put inside the matriz:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the number you want to search inside the matriz:");
		Integer searchNumber = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == searchNumber) {
					System.out.println("Position: " + i + "," + j);
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					else {
						System.out.println();
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
