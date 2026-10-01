package Exercicios;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Adicione o tamanho da matriz:");
		int m = sc.nextInt();
		System.out.println("Adicione o tamanho dos vetores:");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println("Adicione os valores da matriz:");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt(); //adiciona os valores na matriz
			}
		}
		
		System.out.print("Digite algum valor contido na matriz: ");
		int x = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição: " + i + ", " + j);
					if (j > 0) {
						System.out.println("esquerda: " + mat[i][j-1]);
						// se o valor da esquerda existir, imprime
					}if (j < mat[i].length - 1) {
						System.out.println("direita: " + mat[i][j+1]);
						// se o valor da direita existir, imprime
					}if (i > 0) {
						System.out.println("cima: " + mat[i-1][j]);
						// se o valor de cima existir, imprime
					}if (i < mat.length - 1) {
						System.out.println("baixo: " + mat[i+1][j]);
						// se o valor de baixo existir, imprime
						
					}
				}
			}
		}
		
		
		sc.close();
	}

}

/*fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver*/

/*Exemplo de saida:

/*Adicione os valores da matriz:
10 8 15 12
21 11 23 8
14 5 13 19
Digite algum valor contido na matriz: 8
Posição: 0, 1
esquerda: 10
direita: 15
baixo: 11
Posição: 1, 3
esquerda: 23
cima: 12
baixo: 19
*/