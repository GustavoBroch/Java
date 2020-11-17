package condicional2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float valorTotal;
		int quantidade;

		System.out.println("Entre com o número de maças compradas: ");
		quantidade = leia.nextInt();

		if (quantidade > 0 && quantidade < 12) {
			valorTotal = (float) (quantidade * 0.30);
			System.out.printf("\nValor total R$ %.2f", valorTotal);
		} else {
			valorTotal = (float) (quantidade * 0.25);
			System.out.printf("\nValor total R$ %.2f", valorTotal);
		}
		leia.close();
	}

}
