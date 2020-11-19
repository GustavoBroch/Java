package matriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];

		System.out.println("Matriz N1");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("Entre com o valor N1 [" + linha + "][" + coluna + "]: ");
				N1[linha][coluna] = scan.nextInt();
			}
		}
		System.out.println("\nMatriz N2");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.printf("Entre com o valor N2 [" + linha + "][" + coluna + "]: ");
				N2[linha][coluna] = scan.nextInt();
			}
		}
		System.out.printf("\nMatriz M1 = N1 + N2\n");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.print("[" + M1[linha][coluna] + "]\t");
			}
			System.out.println();
		}
		System.out.printf("\nMatriz M2 = N1 - N2\n");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				System.out.print("[" + M2[linha][coluna] + "]\t");
			}
			System.out.println();
		}
		scan.close();

	}
}
