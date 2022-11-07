package if_statements;
import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Working with if else statements
		System.out.println("let's play? Write the number of 2 axis(x and y)"
				+ " and I will show you in which quadrant it is");
		
				
		System.out.println("Type the axis 'x':");
		int x = sc.nextInt();
		
		System.out.println("Type the axis 'y':");
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("The coordinate is in the 'First Quadrant'!");
		}
		else if (x < 0 && y > 0) {
			System.out.println("The coordinate is in the 'Second Quadrant'!");
		}
		else if (x < 0 && y < 0) {
			System.out.println("The coordinate is in the 'Third Quadrant'!");
		}
		else if (x > 0 && y > 0) {
			System.out.println("The coordinate is in the 'Forth Quadrant'!");
		}
		else {
			System.out.println("The coordinate is in the 'Origin'!");
		}
		
//		Accumulative attribution
		
//		Basic plan: $ 50,00 for 100 minutes
//		Each minute that is higher than 100 you got to pay $ 2,00
		
		System.out.println("Let's see hou much is your plan!");
		
		System.out.println("Type how many minutes you have spent on your phone this month:");
		int minutes = sc.nextInt();
		
		double cost = 50.0;
		
		if (minutes < 0 ) {
			System.out.printf("Please, type a number higher tha 0(ZERO)!");
		}
		else if (minutes <= 100 ) {
			System.out.printf("You have to pay $ %.2f! \n", cost);
		}
		else {
			cost += (minutes - 100) * 2;		
			System.out.printf("You have to pay $ %.2f! \n", cost);
		}
		
		sc.close();
	}

}
