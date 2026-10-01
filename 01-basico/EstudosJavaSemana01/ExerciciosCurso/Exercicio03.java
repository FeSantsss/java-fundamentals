package ExerciciosCurso;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algum número: ");
		int N = sc.nextInt();
		
		for(int i=0; i <= N; i++) {
			if(i % 2 != 0) {
				System.out.println(i + " é impar");
			}else {
				System.out.println(i + " é par");
			}
		}
		
	}

}

//um programa que ler um valor inteiro 
//e mostra todos os números ímpares e pares até chegar no valor inserido.