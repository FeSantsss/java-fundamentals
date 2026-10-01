package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int[] num = new int[sc.nextInt()];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("adicione o número " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for(int i=0; i<num.length; i++) {
			if(num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		
		sc.close();
	}

}

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) 
e depois N números inteiros e armazene-os em um vetor. 
Em seguida, mostrar na tela todos os números negativos lidos. 
*/