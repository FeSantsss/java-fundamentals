package Exercicio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

import ClasseSecundaria.Cliente;
import ClasseSecundaria.ItemPedido;
import ClasseSecundaria.Produto;
import Enum.StatusPedido;
import ClassePrincipal.Pedido;


public class Programa {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		Pedido pedido;
		
		System.out.println("Adicione os dados do cliente: ");
		System.out.println();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		String dataN = sc.nextLine();
		LocalDate dataNascimentoReal = LocalDate.parse(dataN, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Cliente cliente = new Cliente(nome, email, dataNascimentoReal);
		
		System.out.println();
		System.out.println("Adicione os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		StatusPedido statusReal = StatusPedido.valueOf(status);
		
		pedido = new Pedido(LocalDateTime.now(), statusReal, cliente);
		
		System.out.print("Quantidade de itens: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Adicione os dados do Produto " + (i+1) + ": ");
			System.out.print("Nome: ");
			String nomeProduto = sc.next();
			System.out.print("Preco: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade do item " + (i+1) + ": ");
			int quantidadeProduto = sc.nextInt();
			
			Produto produtoReal = new Produto(nomeProduto, precoProduto);
			ItemPedido item = new ItemPedido(quantidadeProduto, precoProduto, produtoReal);
			pedido.addItem(item);
		}
		
		System.out.println();
		System.out.println("Dados do pedido: ");
		System.out.println(pedido.toString());
		
		sc.close();
	}

}
