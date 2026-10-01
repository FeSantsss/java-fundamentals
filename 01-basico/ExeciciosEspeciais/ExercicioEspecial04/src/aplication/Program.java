package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ClassePrimaria.Produto;
import ClassesSecundarias.ProdutoImportado;
import ClassesSecundarias.ProdutoUsado;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();

		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i + " dados:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();

			if (tipo == 'i') {
				System.out.print("Taxa de importação: ");
				Double taxaDeImportacao = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaDeImportacao));
			} else if (tipo == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate dataFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
			} else {
				lista.add(new Produto(nome, preco));
			}
		}

		System.out.println();
		System.out.println("Etiquetas de preço:");
		for (Produto produto : lista) {
			System.out.println(produto.etiquetaPreco());
		}

		sc.close();

	}

}
