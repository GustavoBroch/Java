package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		leia.useLocale(Locale.US);

		float indice;

		System.out.println("Entre com o indice de polui��o: ");
		indice = leia.nextFloat();

		if (indice >= 0.05 && indice <= 0.25) {
			System.out.println("Indice de polui��o aceit�vel");

		} else if (indice >= 0.3 && indice < 0.4) {
			System.out.println("Indice: as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades");
		} else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("Indice: as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades");
		} else if (indice >= 0.5) {
			System.out.println("Indice: todos os grupos devem ser notificados a paralisarem suas atividade");
		} else {
			System.out.println("Indice inv�lido");
		}

		leia.close();
	}
}
