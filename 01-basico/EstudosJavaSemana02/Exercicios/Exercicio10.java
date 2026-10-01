package Exercicios;
import java.util.Scanner;
import entities.PessoasVect;
import java.util.Locale;


public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		PessoasVect[] vect = new PessoasVect[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();// Consumir a quebra de linha pendente
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new PessoasVect(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
		for(int i=0;i<vect.length;i++) {
			somaAltura += vect[i].getAltura();
		}
		double mediaAltura = somaAltura/vect.length;
		
		System.out.printf("Altura média: %.2f\n", mediaAltura);
		
		double menor16 = 0.0;
		for(int i=0;i<vect.length;i++) {
			if(vect[i].getIdade() < 16) {
				menor16 += 1;
			}
		}
		double porcentagem = menor16 / vect.length * 100;// Calcula a porcentagem de pessoas com menos de 16 anos
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		
		if(menor16 > 0) {// Verifica se tem pessoas com menos de 16 anos
			System.out.print("Nomes: ");
			for(int i=0;i<vect.length;i++) {// Verifica se a idade é menor que 16
				if(vect[i].getIdade() < 16) {// Se sim, imprime o nome
					System.out.print(vect[i].getNome());
				}
			}
		}
		
		sc.close();
	}

}

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
Depois, mostrar na tela a altura média das pessoas, e mostrar também a 
porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */