package lacos;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero, i = 0, somador = 0;

		System.out.println("Entre com um n�mero: ");
		numero = scan.nextInt();

		do {
			somador = somador + i;
			i++;
			System.out.println(somador);
		} while (i <= numero);
		scan.close();
	}
}
