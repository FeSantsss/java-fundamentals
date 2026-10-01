package ExerciciosCurso;
import java.util.Scanner;
import java.util.Locale;
import entidades.Retangulo;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Adicione a largura e altura do Retângulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Resultados: " + retangulo);
		
		
		
		
		sc.close();
	}

}

/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/