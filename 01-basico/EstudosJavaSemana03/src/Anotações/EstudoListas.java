package Anotações;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class EstudoListas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // Cria uma lista vazia
		
		list.add("Sam"); // Adiciona o elemento 1
		list.add("Dean");
		list.add("Castiel");
		list.add("Sanson");
		System.out.println(list.size()); // Imprime o tamanho da lista (1)
		System.out.println(list); // Imprime a lista
		list.remove(0); // Remove o elemento 1
		
		for (String x: list) { // Percorre a lista
			System.out.println(x); // Imprime os elementos da lista
		}
		
		list.removeIf(x -> x.charAt(0) == 'S'); // Remove os elementos que começam com S
		System.out.println(list);
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(result);
		}
		
		
		 
		
	}
}

/*Estudo de Listas*/