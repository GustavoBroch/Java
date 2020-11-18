package lacos;

public class Exercicio10 {

	public static void main(String[] args) {
		int contador = 233;

		do {
			if (contador >= 300 && contador <= 400) {
				contador += 3;
			} else {
				contador += 5;
			}
			System.out.println(contador);
		} while (contador < 456);
	}
}
