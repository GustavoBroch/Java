package condicional2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int quantidadeLado, medidaLado;
		double areaTotal;

		System.out.println("Entre com o número de lados de um polígono regular");
		quantidadeLado = scan.nextInt();

		System.out.println("Entre com a medida do lado (cm): ");
		medidaLado = scan.nextInt();

		if (quantidadeLado < 3) {

			System.out.println("Não é um polígono.");

		} else if (quantidadeLado == 3) {

			areaTotal = (Math.pow(medidaLado, 2) * Math.sqrt(3)) / 4;
			System.out.printf("O polígono escolhido foi: TRIANGULO e a área total %.2f", areaTotal);

		} else if (quantidadeLado == 4) {

			areaTotal = medidaLado * 4;
			System.out.printf("O polígono escolhido foi: QUADRADO e a área total %.2f", areaTotal);

		} else if (quantidadeLado == 5) {

			areaTotal = (3 * Math.pow(medidaLado, 2) * Math.sqrt(3)) / 2;
			System.out.printf("O polígono escolhido foi: PENTÁGONO e a área total %.2f", areaTotal);

		} else {
			System.out.println("Polígono não identificado.");
		}

		scan.close();
	}
}
