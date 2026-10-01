package ExerciciosCurso;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		Double pi = 3.14159;
		
		System.out.println("Adicione 3 numeros float para calcular: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = (A*C)/2;
		circulo = pi*C*C;
		trapezio = (A+B)*C/2;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.println("As áreas dessas formas a partir dos dados recebidos: ");
		System.out.printf("Triângulo: %.3f%n", triangulo);
		System.out.printf("Círculo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retângulo: %.3f%n", retangulo);
		
		sc.close();
	}

}

//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
