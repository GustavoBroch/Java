package lacos;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("Entre com o número: ");
		numero = scan.nextInt();

		while (numero < 100) {
			numero *= 3;
			System.out.println(numero);
		}
		scan.close();
	}
}
