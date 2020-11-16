package condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se
		 * este número é par ou ímpar, e se é positivo ou negativo.
		 */

		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.println("Entre com um número: ");
		numero = scan.nextInt();

		if (numero < 0) {
			System.out.println("Número é Negativo ");

			numero = Math.abs(numero);

			if (numero % 2 == 0) {
				System.out.println("Número é PAR");
			} else {
				System.out.println("Número é IMPAR");
			}
		} else {
			System.out.println("Número é Positivo");

			if (numero % 2 == 0) {
				System.out.println("Número é PAR");
			} else {
				System.out.println("Número é IMPAR");
			}
		}
		scan.close();
	}

}
