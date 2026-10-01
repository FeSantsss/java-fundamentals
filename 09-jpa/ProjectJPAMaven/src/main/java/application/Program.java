package application;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.People;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
		EntityManager em = emf.createEntityManager();
		
		System.out.print("Deseja listar todos os registros? (S/N): ");
		char resp = sc.next().toUpperCase().charAt(0);
		
		if (resp == 'S') {
			System.out.println("Listando todos os registros:");
			for (People p : em.createQuery("SELECT p FROM People p", People.class).getResultList()) {
				System.out.println(p);
			}
		}
		
		
		
		sc.close();
		em.close();
		emf.close();

	}

}
