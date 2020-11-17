package condicional2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int quantidadeLado, medidaLado;
		double areaTotal;

		System.out.println("Entre com o n�mero de lados de um pol�gono regular");
		quantidadeLado = scan.nextInt();

		System.out.println("Entre com a medida do lado (cm): ");
		medidaLado = scan.nextInt();

		if (quantidadeLado < 3) {

			System.out.println("N�o � um pol�gono.");

		} else if (quantidadeLado == 3) {

			areaTotal = (Math.pow(medidaLado, 2) * Math.sqrt(3)) / 4;
			System.out.printf("O pol�gono escolhido foi: TRIANGULO e a �rea total %.2f", areaTotal);

		} else if (quantidadeLado == 4) {

			areaTotal = medidaLado * 4;
			System.out.printf("O pol�gono escolhido foi: QUADRADO e a �rea total %.2f", areaTotal);

		} else if (quantidadeLado == 5) {

			areaTotal = (3 * Math.pow(medidaLado, 2) * Math.sqrt(3)) / 2;
			System.out.printf("O pol�gono escolhido foi: PENT�GONO e a �rea total %.2f", areaTotal);

		} else {
			System.out.println("Pol�gono n�o identificado.");
		}

		scan.close();
	}
}
