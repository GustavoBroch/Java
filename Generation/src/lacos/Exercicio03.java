package lacos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, vinteUm = 0, ciquenta = 0;

		while (idade != -99) {

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			if (idade > 0 && idade < 21) {
				vinteUm++;
			} else if (idade > 50) {
				ciquenta++;
			}

		}

		System.out.printf("\nQuantidade menores de 21: %d", vinteUm);
		System.out.printf("\nQuantidade maiores de 50: %d", ciquenta);
		leia.close();

	}

}
