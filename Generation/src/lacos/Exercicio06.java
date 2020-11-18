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

			System.out.println("Pessoa " + i + ", entre com número de filhos: ");
			numeroFilho = scan.nextInt();
			mediaFilhos += numeroFilho;

			if (maiorSalario < salario) {
				maiorSalario = salario;
			}

			if (salario <= 100) {
				contadorPessoas++;
			}

		}
		// a) média do salário da população;
		mediaSalario = mediaSalario / PESQUISADO;
		System.out.printf("Media salarial: %.2f", mediaSalario);

		// b) média do número de filhos;
		mediaFilhos = mediaFilhos / PESQUISADO;
		System.out.printf("\nMedia de filhos: %.2f", mediaFilhos);

		// c) maior salário;
		System.out.printf("\nMaior Salário: R$%.2f", maiorSalario);

		// d) percentual de pessoas com salário até R$100,00. (FOR)
		percentualPessoas = (contadorPessoas * 100) / PESQUISADO;
		System.out.println("\nPerncetual de pessoas que ganham até R$100.00: " + percentualPessoas + "%");

		scan.close();
	}
}
