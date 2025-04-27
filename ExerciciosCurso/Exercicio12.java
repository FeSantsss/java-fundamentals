package ExerciciosCurso;
import java.util.Locale;
import java.util.Scanner;
import entidades.Student;

public class Exercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student newStudent;
		newStudent = new Student();
		
		System.out.print("Name: ");
		newStudent.nome = sc.nextLine();
		
		System.out.println("Adicione as 3 notas: ");
		newStudent.n1 = sc.nextDouble();
		newStudent.n2 = sc.nextDouble();
		newStudent.n3 = sc.nextDouble();
		
		System.out.println(newStudent);
		
		sc.close();
	}

}

/*Fazer um programa para ler o nome de um aluno e 
as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e,
 em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota).*/