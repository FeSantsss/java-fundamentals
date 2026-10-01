package Exercicios;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da Matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("números na diagonal principal:");
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Números negativos: ");
		for(int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j] < 0) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
	}

}

//estudo de Matriz 2D