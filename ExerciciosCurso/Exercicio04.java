package ExerciciosCurso;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char rep;
		
		do {
			double celsius, fahrenheit;
			System.out.println("Digite a temperatura desejada em Celsius: ");
			celsius = sc.nextDouble();
			
			fahrenheit = (celsius * 9 / 5) + 32;

			System.out.printf("É equivalente em Fahrenheit: %.1f%n ",fahrenheit);
			
			System.out.println("deseja continuar (s/n)? ");
			rep = sc.next().charAt(0);
			
		}while (rep == 's');
		
		sc.close();
	}

}

//programa pra calcular o valor de celsius para fahrenheit. 