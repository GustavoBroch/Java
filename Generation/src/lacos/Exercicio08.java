package lacos;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
	 * apresente no final o total do somat�rio, a m�dia e o total de valores lidos.
	 * O programa deve fazer as leituras dos valores enquanto o usu�rio estiver
	 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usu�rio
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

		System.out.println("Somat�rio: " + soma);
		System.out.println("M�dia: " + media);
		System.out.println("Total de valores lidos: " + contador);

		scan.close();
	}
}
