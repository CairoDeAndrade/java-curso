package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
			System.out.print("Enter the amount of wage to compare: ");
			Double wage = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(x -> x.getWage() > wage)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("People's email whose wage is more than " + String.format("%.2f", wage));
			emails.forEach(System.out::println);
			
			Double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getWage())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("People's sum of wages whose name starts with 'M': "
					+ String.format("%.2f", sum));

		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
