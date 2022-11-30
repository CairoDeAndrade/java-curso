package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.printf("Email: ");
		String email = sc.next();	
		
		System.out.printf("Birth date: \n");
		String birthDate = sc.next();
		
		Client client = new Client(name, email, sdf.parse(birthDate));

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		
		Product product = new Product();
		OrderItem item = new OrderItem();
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.println("How many items to this order?");
		Integer itemsQuantity = sc.nextInt();
		
		for (int i = 0; i < itemsQuantity; i++) {
			System.out.println("Enter the data of the " + (i + 1) + "° product: " );
			System.out.printf("Product name: ");
			String productName = sc.next();
			
			System.out.printf("\nProduct price: $ ");
			Double productPrice = sc.nextDouble();
			
			System.out.printf("\nQuantity: ");
			Integer quantity = sc.nextInt();
			
			product = new Product(productName, productPrice);
			item = new OrderItem(quantity, product);
			order.addItem(item);
		}
				
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
