package condicional2;

import java.util.Scanner;

public class Extra {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite 1 para falar com o setor de Contas" + "\nDigite 2 para falar com o setor de Compras"
				+ "\nDigite 3 para falar com o Suporte" + "\nDigite 9 para SAIR\n5");

		System.out.println("Digite o número: ");
		numero = leia.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Bem Vindo ao setor de Contas, como posso ajudá-lo(a) ?");
			break;
		case 2:
			System.out.println("Bem Vindo ao setor de Compras, como posso ajudá-lo(a) ?");
			break;
		case 3:
			System.out.println("Bem Vindo ao Suporte, como posso ajudá-lo(a) ?");
			break;
		case 9:
			System.out.println("Obrigado pelo contato. Desligando!");
			break;

		default:
			System.out.println("Número digitado inválido");
			break;
		}

		leia.close();

	}

}
