package Exercicios;
import java.util.Scanner;
import entities.ContaBancaria;
import java.util.Locale;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double saldo = 0.0;
		
		System.out.print("Adicione o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Adicione o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja adicionar um valor inicial? (s/n): ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Adicione o valor inicial: ");
			saldo = sc.nextDouble();
		}
		
		System.out.println("Dados da conta: ");
		ContaBancaria conta = new ContaBancaria(numeroConta, nome, saldo);
		conta.dados();
		
		System.out.print("Adicione um valor para deposito: ");
		double addMoney = sc.nextDouble();
		conta.deposito(addMoney);
		System.out.println("Dados atualizados: ");
		conta.dados();
		
		System.out.print("Adicione um valor para saque: ");
		double removMoney = sc.nextDouble();
		conta.saque(removMoney);
		System.out.println("Dados atualizados: ");
		conta.dados();
		

	}

}
