package lacos;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int PESQUISADO = 20;
		int numeroFilho, contadorPessoas = 0;
		float salario, mediaSalario = 0, mediaFilhos = 0, maiorSalario = 0, percentualPessoas;

		for (int i = 1; i <= PESQUISADO; i++) {
			System.out.println("Pessoa " + i + ", entre com o salario: ");
			salario = scan.nextInt();
			mediaSalario += salario;

			System.out.println("Pessoa " + i + ", entre com n�mero de filhos: ");
			numeroFilho = scan.nextInt();
			mediaFilhos += numeroFilho;

			if (maiorSalario < salario) {
				maiorSalario = salario;
			}

			if (salario <= 100) {
				contadorPessoas++;
			}

		}
		// a) m�dia do sal�rio da popula��o;
		mediaSalario = mediaSalario / PESQUISADO;
		System.out.printf("Media salarial: %.2f", mediaSalario);

		// b) m�dia do n�mero de filhos;
		mediaFilhos = mediaFilhos / PESQUISADO;
		System.out.printf("\nMedia de filhos: %.2f", mediaFilhos);

		// c) maior sal�rio;
		System.out.printf("\nMaior Sal�rio: R$%.2f", maiorSalario);

		// d) percentual de pessoas com sal�rio at� R$100,00. (FOR)
		percentualPessoas = (contadorPessoas * 100) / PESQUISADO;
		System.out.println("\nPerncetual de pessoas que ganham at� R$100.00: " + percentualPessoas + "%");

		scan.close();
	}
}
