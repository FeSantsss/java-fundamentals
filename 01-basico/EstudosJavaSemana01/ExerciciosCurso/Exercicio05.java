package ExerciciosCurso;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double carne = 15.90, frango = 16.85, vegetariano = 12.99, preço = 0.0, refrigerante = 5.99;
		double cheddar = 1.50, ketchup = 0.50, agua = 0.25;
		
		System.out.println("Bem-vindo a nossa lanchonete!");
		System.out.println("Veja o cardapio e faça seu pedido!");
		System.out.println("Sanduíches: Frango, Carne, Vegetariano.");
		System.out.println("Bebidas: Refrigerante, Água.");
		System.out.println("Faça seu pedido!");
		
		System.out.println("Deseja o que de Sanduíche? (Frango, Carne, Vegetariano)");
		String pedidoLanche = sc.next().toLowerCase();
		
		switch (pedidoLanche) {
			case "frango":
				preço += frango;
				break;
			case "carne":
				preço += carne;
				break;
			case "vegetariano":
				preço += vegetariano;
				break;
			default: 
				System.out.println("lanche indisponivel!");
				break;
		}
		
		System.out.println("Deseja quais complementos? (Cheddar, Ketchup)");
		String pedidoCompLan = sc.next().toLowerCase();
		
		switch (pedidoCompLan) {
			case "cheddar":
				preço += cheddar;
				break;
			case "ketchup":
				preço += ketchup;
				break;
			default: 
				System.out.println("complemento indisponivel!");
				break;
		}
		
		System.out.println("Deseja o que de Bebida? (Refrigerante, Água)");
		String pedidoBebida = sc.next().toLowerCase();
		
		switch (pedidoBebida) {
			case "refrigerante":
				preço += refrigerante;
				break;
			case "água":
				preço += agua;
				break;
			default: 
				System.out.println("bebida indisponivel!");
				break;
		}
		
		
		
		System.out.printf("Seu pedido deu: %.2f%n",preço);
		System.out.println("Aproveite seu lanche!");
		
	}

}




/* Desenvolva um programa em Java que permita ao usuário personalizar seu pedido
 *  em uma lanchonete. O usuário poderá escolher entre diferentes tipos de sanduíches 
 *  (carne, frango ou vegetariano), adicionar ingredientes extras e selecionar bebidas.
 *   O programa calculará o preço final com base nas escolhas feitas e 
 *   exibirá as informações feitas no pedido.
 */
