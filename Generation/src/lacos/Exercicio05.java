package lacos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0, media = 0, x = 0;

		do {

			System.out.println("Entre com um n�mero: ");
			numero = scan.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				media = media + numero;
				x++;
			}

		} while (numero != 0);

		media = media / x;
		System.out.printf("M�dia dos multiplos de 3: %d", media);
		scan.close();
	}
}
