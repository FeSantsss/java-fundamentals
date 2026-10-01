package ExerciciosCurso;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("adicione as medidas do Triângulo X:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double area = calcTri(a, b, c);
		
		System.out.println("adicione as medidas do Triângulo Y:");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();
		
		double area2 = calcTri(a2, b2, c2);
		
		System.out.printf("O valor do Triângulo X: %.4f%n", area);
		System.out.printf("O Valor do Triângulo Y: %.4f%n", area2);
		
		double high = HighArea(area, area2);
		
		showHigh(high);
		
		sc.close();
	}
	
	public static double calcTri(double x, double y, double z) {
		double area;
		double sp;
		
		sp = (x + y + z) / 2.0;
		area = Math.sqrt(sp * (sp-x) * (sp-y) * (sp-z));
		
		return area;
	}
	
	public static double HighArea(double a, double b) {
		double aux;
		
		if(a > b) {
			aux = a;
		}else {
			aux = b;
		}
		
		return aux;
		
	}
	
	public static void showHigh(double value) {
		System.out.printf("O triângulo com a maior área é: %.4f%n", value);
	}
	
}
