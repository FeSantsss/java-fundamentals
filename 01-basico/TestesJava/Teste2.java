import java.util.Scanner;
import java.util.Locale;

public class Teste2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int idade;
		double altura;
		
		System.out.println("Adicione os dados de forma respectiva (Nome, Idade, Altura): ");
		
		name = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();
		
		System.out.println("Dados Digitados: ");
		System.out.printf("seu nome é %s%n", name);
		System.out.printf("tens %d anos de idade%n", idade);
		System.out.printf("e tens %.2f de altura%n", altura);
		
		
		sc.close();
	}

}