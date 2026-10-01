package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		int[] vect = new int[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite o número " + (i+1) + ": ");
			vect[i] = sc.nextInt();
		}
		
		System.out.print("Os números digitados foram: ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / vect.length;
		System.out.printf("\nA soma: %.2f\n", soma);
		System.out.printf("A média: %.2f\n", media);
	}

}

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */