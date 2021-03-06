package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
////		Construtor obriga a inserir name,price e quantity
//		Product product = new Product(name, price, quantity);
		
//		PARA EXEMPLO CONSTRUTORES
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Update name: "+product.getName());
		
//		Para setar um valor fixo par ao pre�o
		product.setPrice(1200.00);
		
//		Para acessar o price
		System.out.println("Updated price: "+product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}