package ExerciciosCurso;

import entidades.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("adicione as medidas do Triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		double area = x.area();

		System.out.println("adicione as medidas do Triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double area2 = y.area();

		System.out.printf("O valor do Triângulo X: %.4f%n", area);
		System.out.printf("O Valor do Triângulo Y: %.4f%n", area2);

		double high = HighArea(area, area2);

		showHigh(high);

		sc.close();
	}

	public static double HighArea(double a, double b) {
		double aux;

		if (a > b) {
			aux = a;
		} else {
			aux = b;
		}

		return aux;

	}

	public static void showHigh(double value) {
		System.out.printf("O triângulo com a maior área é: %.4f%n", value);
	}

}

/* início dos estudos de POO em Java com o exercicio07 usando 
a class Triangulo no package entidades*/