package Exercicios;
import java.util.Scanner;

import entities.ProductVect;

import java.util.Locale;


public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos você vai adicionar? ");
		ProductVect[] vect = new ProductVect[sc.nextInt()];
		
		for (int i=0;i<vect.length;i++) {
			System.out.print("Adicione o nome do produto " + (i+1) + ": ");
			String name = sc.next();
			System.out.print("Adicione o preço do produto " + (i+1) + ": ");
			double price = sc.nextDouble();
			vect[i] = new ProductVect(name, price);
		}
		
		double soma = 0.0;
		
		for (int i=0;i<vect.length;i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		
		System.out.println("A media dos preços é: " + String.format("%.2f", media));
	}

}
