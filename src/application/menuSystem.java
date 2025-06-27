package application;

import java.util.Scanner;
import model.entities.ContaBancaria;

public class menuSystem {

	public static void menu(Scanner sc, ContaBancaria conta) {
		boolean continuar = true;
		while (continuar) {
			System.out.println("Escolha uma opção:" + "\n1 - Depositar" + "\n2 - Sacar" + "\n3 - Exibir dados da conta"
					+ "\n4 - Sair");

			switch (sc.nextInt()) {
			case 1:
				System.out.print("Digite o valor para depositar: ");
				Double valorDepositado = sc.nextDouble();
				conta.depositar(valorDepositado);
				break;
			case 2:
				System.out.print("Digite o valor para sacar: ");
				Double valorSacado = sc.nextDouble();
				conta.sacar(valorSacado);
				break;
			case 3:
				System.out.println("Dados da conta:");
				System.out.println(conta.toString());
				break;
			case 4:
				System.out.println("Obrigado por usar nosso sistema!");
				break;
			default:
				System.out.println("Opção inválida. Encerrando o programa.");
				break;
			}

			if (continuar != false) {
				System.out.print("Deseja continuar? (s/n): ");
				char continuarResposta = sc.next().toLowerCase().charAt(0);
				if (continuarResposta == 'n') {
					continuar = false;
				} else if (continuarResposta != 's') {
					System.out.println("Opção inválida. Encerrando o programa.");
					continuar = false;
				}
			}
		}
	}

}
