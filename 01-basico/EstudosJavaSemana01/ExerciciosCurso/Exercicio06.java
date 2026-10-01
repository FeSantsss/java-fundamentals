package ExerciciosCurso;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		String rep = "";

		System.out.println("Adicione 3 números: ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int high = max(a, b, c);
		
		showRes(high);

		sc.close();

	}

	public static int max(int a, int b, int c) {
		int aux;

		if (a > b && a > c) {
			aux = a;
		} else if (b > a) {
			aux = b;
		} else {
			aux = c;
		}

		return aux;

	}
	
	public static void showRes(int value) {
		System.out.println("o maior número é: " + value);
	}

}
