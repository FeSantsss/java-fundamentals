package Exercicios;

import java.util.Scanner;
import Entities.Funcionario;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos funcionarios serão colocados: ");
		int n = sc.nextInt();
		List<Funcionario> list = new ArrayList<>();

		for (int i = 0; i < n; i++) { //criar o funcionario
			System.out.println("\nFuncionario #" + (i + 1) + ":");
			System.out.print("Digite o ID: ");
			Integer ID = sc.nextInt();
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite seu Salário: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(ID, name, salario)); //add o fu.. na list
		}

		System.out.print("\nDeseja aumentar o salário de qual Funcionario? ");
		int idSalario = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		//pega o id do funcionario e verifica se existe, se não existir retorna null
		
		if(func == null) { //verifica se o id é inexistente
			System.out.println("Esse Id não existe!!");
		}else {//se for um id existente
			System.out.print("\nAdicione a porcetagem de aumento: ");
			double porcetagem = sc.nextDouble();
			//pega o id com o salário e faz a porcetagem com o método
			func.AcrescimentoSalario(porcetagem);
		}
		
		System.out.println("\nLista de Funcionarios: ");
		for(Funcionario fun: list) {
			System.out.println(fun);
		}

	}
}