package ExerciciosCurso;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		String DiaSemana = "", ERRO = "";
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
		
		System.out.println("Digite o dia da semana de acordo com a numeração:");
		x = sc.nextInt();
		
		switch (x){
			case 1:
				DiaSemana = "Segunda";
				break;
			case 2:
				DiaSemana = "Terça";
				break;
			case 3:
				DiaSemana = "Quarta";
				break;
			case 4:
				DiaSemana = "Quinta";
				break;
			case 5:
				DiaSemana = "Sexta";
				break;
			case 6:
				DiaSemana = "Sabado";
				break;
			case 7:
				DiaSemana = "Domingo";
				break;
			default: 
				ERRO = "Adicione um valor válido!";
				break;
		}
		
		if (x >= 1 && x < 8) {
		System.out.printf("hoje é %s%n", DiaSemana);
		}else {
		System.out.println(ERRO);
		}
		
		}while(x <= 7);
		
		sc.close();

	}

}
//exercicio usando switch, lendo os dias da semana de 1 a 7.