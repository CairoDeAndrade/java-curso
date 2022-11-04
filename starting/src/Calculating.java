import java.util.Scanner;

public class Calculating {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Calling variables
		double x;
		double y;
		double z;
		double A, B, C;
		
//		Inputs
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		sc.close();
		
//		Square root
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.println("Square Root of " + x + " = " + A);
		System.out.println("Square Root of " + y + " = " + B);
		System.out.println("Square Root of " + z + " = " + C);
		
//		Power
		A = Math.pow(x, y);
		B = Math.pow(y, z);
		C = Math.pow(z, x);
		System.out.println(x + " to the power of " + y + " = " + A);
		System.out.println(y + " to the power of " + z + " = " + B);
		System.out.println(z + " to the power of " + x + " = " + C);
		
//		Absolute
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Absolute of " + y + " = " + A);
		System.out.println("Absolute of " + z + " = " + B);
	}

}