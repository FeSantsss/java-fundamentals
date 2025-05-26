package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Informe o número de contribuintes: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.println("Dados do contribuinte #" + (i + 1) + ":");
			System.out.println();
			
			System.out.print("Pessoa Física ou Jurídica (f/j)? ");
			char tipo = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		System.out.println();
		System.out.println("impostos pagos:");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
		
		double totalImpostos = 0.0;
		for (Pessoa pessoa : lista) {
			totalImpostos += pessoa.calcularImposto();
		}
		
		System.out.println();
		System.out.printf("Total de impostos: R$ %.2f%n", totalImpostos);
		
		
		sc.close();
	}

}
