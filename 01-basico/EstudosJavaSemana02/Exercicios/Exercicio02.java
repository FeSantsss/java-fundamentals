package Exercicios;

import entities.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Adicione o valor do Dolar atualmente: ");
		double valorDolar = sc.nextDouble();
		System.out.print("Adicione o quanto de Dolar quer comprar: ");
		double dolarComprar = sc.nextDouble();
		double valorReais = CurrencyConverter.DolarCotacao(valorDolar, dolarComprar);
		System.out.print("a quantidade de reais que terá que pagar: ");
		System.out.println(valorReais);

		sc.close();
	}

}

/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
 * sobre o valor em dólar
 */