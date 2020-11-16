package condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se
		 * este n�mero � par ou �mpar, e se � positivo ou negativo.
		 */

		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.println("Entre com um n�mero: ");
		numero = scan.nextInt();

		if (numero < 0) {
			System.out.println("N�mero � Negativo ");

			numero = Math.abs(numero);

			if (numero % 2 == 0) {
				System.out.println("N�mero � PAR");
			} else {
				System.out.println("N�mero � IMPAR");
			}
		} else {
			System.out.println("N�mero � Positivo");

			if (numero % 2 == 0) {
				System.out.println("N�mero � PAR");
			} else {
				System.out.println("N�mero � IMPAR");
			}
		}
		scan.close();
	}

}
