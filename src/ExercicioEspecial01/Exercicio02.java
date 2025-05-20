package ExercicioEspecial01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

import entities.Enum.LvlTrabalhador;
import ClassesSecundarias.Departamento;
import ClassesSecundarias.HoraContrato;
import ClassePrincipal.Trabalhador;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Adicione o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();

		System.out.println("Adicione os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel (Junior/Pleno/Senior): ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salario base: ");
		Double salarioBase = sc.nextDouble();

		Departamento departamento = new Departamento(nomeDepartamento);
		LvlTrabalhador nivel = LvlTrabalhador.valueOf(nivelTrabalhador);
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, nivel, salarioBase, departamento);

		System.out.print("Quantos contratos tem esse trabalhador? ");
		int numContratos = sc.nextInt();
		HoraContrato contratos[] = new HoraContrato[numContratos];
		for (int i = 0; i < contratos.length; i++) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println("Adicione os dados do contrato " + (i + 1) + ": ");
			System.out.print("Data (dd/MM/yyyy): ");
			String data = sc.next();
			LocalDate dataFormatada = LocalDate.parse(data, dtf);
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();

			contratos[i] = new HoraContrato(dataFormatada, valorPorHora, horas);
			trabalhador.addContrato(contratos[i]);
		}

		System.out.print("Deseja ver a renda de qual mês (MM YYYY)? ");
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		System.out.println("Departamento: " + trabalhador.getDepartment().getNome());
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Nivel: " + trabalhador.getNivel());
		System.out.println("Contrato - " + trabalhador.rendaMensal(mes, ano));

	}

}
