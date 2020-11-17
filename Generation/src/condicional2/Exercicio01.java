package condicional2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Entre com o primeiro valor: ");
		numero1 = leia.nextInt();

		System.out.println("Entre com o segundo valor: ");
		numero2 = leia.nextInt();

		if (numero1 > numero2) {
			System.out.printf("O maior valor apresentado foi %d", numero1);
		} else if (numero1 < numero2) {
			System.out.printf("O maior valor apresentado foi %d", numero2);
		} else {
			System.out.println("Os valores digitados são iguais");
		}

		leia.close();
	}
}
