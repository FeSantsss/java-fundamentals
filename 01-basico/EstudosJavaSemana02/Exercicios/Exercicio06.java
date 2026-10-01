package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();
        
        double[] alturasVect = new double[n];
        
        for (int i=0; i<n; i++) {
        	System.out.print("Digite a altura da pessoa " + (i+1) + ": ");
        	alturasVect[i] = sc.nextDouble();
        }
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += alturasVect[i];
		}
		double media = soma/n;
		
		System.out.printf("A média de altura é: %.2f%n", media);
		
        sc.close();
    }
}

/*inicio de estudos de vetores/arrays.*/