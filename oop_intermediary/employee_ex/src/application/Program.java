package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.println("How many employees do you want to register?");
		Integer employeesQuantity = sc.nextInt();

		for (int i = 0; i < employeesQuantity; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.println("enter the id:");
			Integer id = sc.nextInt();

			System.out.println("Enter the name:");
			String name = sc.next();

			System.out.println("Enter the wage:");
			Double wage = sc.nextDouble();
			System.out.println();

			employees.add(i, new Employee(id, name, wage));
		}

		System.out.println(employees.toString());

		System.out.println("Do you want to increase some od those wages?(y/n)");
		Character answer = sc.next().charAt(0);

		if (answer.equals('y')) {
			System.out.println("Enter the employee id that will have salary increase:");
			Integer id = sc.nextInt();

//			Checking if the id exists
			Integer position = position(employees, id);

			if (position == null) {
				System.out.println("This id does not exists! Try again:");
				id = sc.nextInt();
			} else {
				System.out.println("How much do you want to increase %%(In percentage)?");
				Integer percentage = sc.nextInt();
				employees.get(position).increaseWage(percentage);
			}

		}

		System.out.println("List of employees:");
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return id;
			}
		}
		return null;
	}

}
