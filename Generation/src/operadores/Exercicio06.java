package operadores;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		final int ANOS = 365, MESES = 30;
		int anos, meses, dias, dia;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade expressa em dias: ");
		dias = scanner.nextInt();
		
		anos = dias / ANOS;
		meses = (dias - (anos * ANOS)) / MESES;
		dia = dias - ((anos* ANOS) + (meses * MESES));
		
		System.out.println("O total de dias: " + dias +" corresponde: " + anos + 
				"ano(s) " + meses + " mes(es) " + dia + " dias");
		scanner.close();
	}

}
