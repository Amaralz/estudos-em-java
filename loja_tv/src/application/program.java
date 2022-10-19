package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		
		
		System.out.println("====enter product data====");
		System.out.println("name: ");
		product.name = sc.nextLine();
		
		System.out.println("price: ");
		product.price = sc.nextDouble();
		
		System.out.println("quantity in stock: ");
		product.quantity = sc.nextInt();
		
		// System.out.println(product.toString()); jeito formal para chamar o print em outra classe porem nao é necessario
		System.out.println("product data: " + product);
		
		System.out.println();
		System.out.println("enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("updated data: " + product);
		
		System.out.println();
		System.out.println("enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("updated data: " + product);
		
		
		sc.close();
	}

}
