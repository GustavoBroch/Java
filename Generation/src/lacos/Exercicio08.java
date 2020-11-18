package lacos;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	 * apresente no final o total do somatório, a média e o total de valores lidos.
	 * O programa deve fazer as leituras dos valores enquanto o usuário estiver
	 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário
	 * fornecer um valor negativo. (WHILE)
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero, soma = 0, contador = 1;
		float media;

		while (true) {
			System.out.println("Entre com um valor: ");
			numero = scan.nextInt();
			if (numero < 0) {
				contador--;
				break;
			}
			soma += numero;
			contador++;

		}
		media = (float) soma / contador;

		System.out.println("Somatório: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Total de valores lidos: " + contador);

		scan.close();
	}
}
