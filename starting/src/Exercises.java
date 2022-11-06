import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {	
//		First exercises
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the radius of the circle:");
		
		double radius;
		double result;
		radius = sc.nextInt();
		
		result = Math.pow(radius, 2) * 3.14;
		
		System.out.printf("The area of your circle is: %.2f\n", result);
		sc.close();
	}

}
