package lacos;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soma = 0;

		for (int i = 0; i <= 500; i++) {

			if (i % 3 == 0) {
				if (!(i % 2 == 0)) {
					soma += i;
				}
			}
		}
		System.out.println("A soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s: " + soma);
		scan.close();
	}
}
