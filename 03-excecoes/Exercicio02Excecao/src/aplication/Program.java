package aplication;

import java.util.Scanner;

import model.entities.Conta;
import model.exception.ExececaoCustom;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Entre com os dados da conta:");
			System.out.println();
			
			System.out.print("Número da conta: ");
			Integer numeroConta = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome do titular: ");
			String nomeTitular = sc.nextLine();
			
			System.out.print("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			
			System.out.println();
			Conta conta = new Conta(numeroConta, nomeTitular, saldo, limiteSaque);
			
			System.out.print("Realize um saque: ");
			Double valorSaque = sc.nextDouble();
			conta.Sacar(valorSaque);
			
			System.out.println("Novo saldo: " + conta.getSaldo());
			
		}
		catch (ExececaoCustom e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		} 
		finally {
			sc.close();
			
		}
	}

}
