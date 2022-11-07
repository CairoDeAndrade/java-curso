import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
//		Exercise 1
		
		System.out.println("Type the radius of the circle:");
		
		double radius;
		double result;
		radius = sc.nextInt();
		
		result = Math.pow(radius, 2) * 3.14;
		
		System.out.printf("The area of your circle is: %.2f\n", result);
		
//		Exercise 2
		System.out.println("Let's see how much is the wage of the worker?");
		
		int hours_of_work;
		double earn_per_hour;
		double monthly_wage;
		int worked_days;

		System.out.println("First, type how many hours this employee work a day:");
		hours_of_work = sc.nextInt();
		
		System.out.println("Now, How's the earn per hour of this worker?");
		earn_per_hour = sc.nextDouble();
		
		System.out.println("Finally, How many days does th eemployee work per month?");
		worked_days = sc.nextInt();


		monthly_wage = (hours_of_work * earn_per_hour) * worked_days;
		
		System.out.printf("\n The employee's monthly wage is: %.2f \n", monthly_wage);
		
		sc.close();
	}

}
