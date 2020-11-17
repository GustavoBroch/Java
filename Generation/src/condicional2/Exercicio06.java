package condicional2;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2, numero3;

		System.out.println("Entre com o primeiro valor: ");
		numero1 = leia.nextInt();

		System.out.println("Entre com o segundo valor: ");
		numero2 = leia.nextInt();

		System.out.println("Entre com o terceiro valor: ");
		numero3 = leia.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {

			System.out.println("O maior número: " + numero1);

		} else if (numero2 > numero1 && numero2 > numero3) {

			System.out.println("O maior número: " + numero2);

		} else if (numero3 > numero1 && numero3 > numero2) {

			System.out.println("O maior número: " + numero3);
		} else {
			System.out.println("3 números iguais");
		}
		leia.close();
	}
}