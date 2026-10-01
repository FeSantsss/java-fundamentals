package ExerciciosCurso;

import java.util.Locale;
import java.util.Scanner;
import entidades.Employee;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee;
		employee = new Employee();

		System.out.print("Nome: ");
		employee.nome = sc.nextLine();

		System.out.print("Salário Bruto: ");
		employee.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		double quantify = sc.nextDouble();
		employee.NetSalary(quantify);
		
		System.out.println(employee);
		
		System.out.println("Quanto de desconto quer no salário?");
		quantify = sc.nextDouble();
		employee.IncreaseSalary(quantify);
		
		System.out.println(employee);
		
		sc.close();
	}

}

/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
 * mostrar novamente os dados do funcionário.
 */