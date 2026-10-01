package Exercicios;
import java.util.Scanner;
import entities.Carro;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do carro 1:");
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha
		//sem cor
		
		Carro carro1 = new Carro(modelo, ano); //criação do objeto carro1
		System.out.println("Dados do carro 1:");
		carro1.dados();
		
		System.out.println("informe os dados do carro 2:");
		System.out.print("Modelo: ");
		String modelo2 = sc.nextLine();
		System.out.print("Ano: ");
		int ano2 = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha
		System.out.print("Cor: ");
		String cor = sc.nextLine();
		//com cor
		
		Carro carro2 = new Carro(modelo2, ano2, cor); //criação do objeto carro2
		
		System.out.println("Dados do carro 2:");
		carro2.dados();
		
		sc.close();
	}

}


/*exercicio com sobrecarga de construtores com a classe Carros*/