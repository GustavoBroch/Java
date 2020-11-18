package lacos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {

			System.out.println("Entre com um valor: ");
			numero = scan.nextInt();

			soma = soma + numero;

		} while (numero != 0);

		System.out.println("A soma dos números digitado(s): " + soma);
		scan.close();
	}
}
