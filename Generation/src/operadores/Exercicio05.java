package operadores;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int ANOS = 365, MESES = 30;
		int anos, meses, dias;
		
		System.out.println("Digite a sua idade expressa em anos: ");
		anos = scanner.nextInt();
		System.out.println("Digite a sua idade expressa em meses: ");
		meses = scanner.nextInt();
		System.out.println("Digite a sua idade expressa em dias: ");
		dias = scanner.nextInt();

		anos = anos * ANOS;
		meses = meses * MESES;
		
		dias = anos + meses + dias;
		
		System.out.println("A sua idade em dias é: " + dias);
		scanner.close();
	}

}
