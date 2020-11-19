package vetor;

public class Exercicio01 {

	public static void main(String[] args) {

		int[] dado = new int[10];
		int contador = 0;
		float mediaAritmetica = 0, maiorPontuacao = 0;

		for (int i = 0; i < dado.length; i++) {
			dado[i] = (int) (Math.random() * 6) + 1;
			mediaAritmetica += dado[i];

			if (maiorPontuacao < dado[i]) {
				maiorPontuacao = dado[i];
			}
		}

		for (int i = 0; i < dado.length; i++) {
			System.out.print("[");
			System.out.print(dado[i]);
			System.out.print("]");

			if (maiorPontuacao == dado[i]) {
				contador++;
			}
		}

		mediaAritmetica = mediaAritmetica / dado.length;
		System.out.printf("\nMedia Aritmética: %.2f", mediaAritmetica);
		System.out.printf("\nMaior Número: %.2f", maiorPontuacao);
		System.out.printf("\nOcorrência da maior pontuação: %d", contador);

	}
}
