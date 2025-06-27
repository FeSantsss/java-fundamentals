package application;

import model.entities.ContaBancaria;

import java.util.*;
import java.time.*;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Bem-vindo ao banco Java!");
			System.out.print("Desejas criar uma nova conta? (s/n)");
			char resposta = sc.next().toLowerCase().charAt(0);

			System.out.println();

			if (resposta == 's') {
				System.out.println("Adicione os dados da conta:");
				System.out.print("Número da conta: ");
				Integer numeroDaConta = sc.nextInt();
				sc.nextLine();
				System.out.print("Titular: ");
				String titular = sc.nextLine();
				System.out.print("Saldo inicial: ");
				double saldo = sc.nextDouble();
				LocalDateTime dataDeCriacao = LocalDateTime.now();

				ContaBancaria conta = new ContaBancaria(numeroDaConta, titular, saldo, dataDeCriacao);

				System.out.println("Conta criada com sucesso!");
				System.out.println();
				
				menuSystem.menu(sc, conta);

			} else if (resposta == 'n') {
				System.out.println("Obrigado por usar nosso sistema!");
				return;
			} else {
				System.out.println("Opção inválida. Encerrando o programa.");
				return;
			}
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
