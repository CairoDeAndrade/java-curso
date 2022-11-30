package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.print("Enter the number of products: ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Common, used or imported?(c/u/i)");
			char type = sc.next().charAt(0);
			
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (type == 'c') {;
				productList.add(new Product(name , price));
			} 
			else if (type == 'u') {
				System.out.print("Manufacture Date: ");
				String date = sc.next();
				
				productList.add(new UsedProduct(name, price, sdf.parse(date)));
			}
			else if (type == 'i') {
				
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				productList.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				System.out.println("Error! Type a valid type of product between '(c/u/i)'");
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
