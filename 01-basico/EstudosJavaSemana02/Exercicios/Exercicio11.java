package Exercicios;
import java.util.Scanner;
import entities.Room;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Room[] rooms = new Room[10];//Array de 10 quartos
		
		System.out.print("Quantos quartos deseja alugar? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Aluguel de quarto #" + (i+1));
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int number = sc.nextInt();
			rooms[number] = new Room(name, email, number);
		}
		
		System.out.println("Quartos alugados:");
		for(int i=0;i<rooms.length;i++) {
			if(rooms[i] != null) {// Verifica se o quarto está alugado
				System.out.println(rooms[i].getNumber() 
						+ ": " 
						+ rooms[i].getName()
						+ ", " 
						+ rooms[i].getEmail()
						+ String.format("%n-------------------------------"));
			}
		}
	}

}
