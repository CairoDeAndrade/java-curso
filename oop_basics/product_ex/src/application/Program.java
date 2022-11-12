package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product data:");
		Product product = new Product();
		
		System.out.print("Name: ");
		product.name = sc.next();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
					
		System.out.print("Product data:" + product);
		
		System.out.printf("\n Enter the number of products to be added in stock: \n");
		int quantity = sc.nextInt();
		product.addPrducts(quantity);
		System.out.println("Updated data: " + product);
		
		System.out.printf("\n Enter the number of products to be added in stock: \n");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
