package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
		
		Order order = new Order(LocalDate.now(), OrderStatus.valueOf(status), client);
		
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
			
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(quantity, product);
			order.addItem(item);
		}
				
		System.out.println("ORDER SUMMARY:");
		System.out.printf("Order moment: %s\n", order.getMoment());
		System.out.printf("Order status: %s\n", order.getStatus());
		System.out.printf("\n%s\n", client.toString());
		
		System.out.println("Order items:");
		for (int i = 0; i < order.; i++) {
			System.out.println(itemsList.get(i).getProduct().getName()
					+ ", Quantity: "
					+ itemsList.get(i).getQuantity()
					+ ", Subtotal: $ " + itemsList.get(i).subTotal());
		}
		
		System.out.println("Total price: $ " + order.total());
		
		sc.close();
	}

}
