package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quant = sc.nextInt();
		Product product = new Product(name, price, quant);
		
		System.out.println("Product Data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		quant = sc.nextInt();
		product.addProduct(quant);
		System.out.println("Updated data: " + product);
		
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quant = sc.nextInt();
		product.removeProduct(quant);
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}

/*exercicio09 da semana01 com construtores/encapsulamento*/