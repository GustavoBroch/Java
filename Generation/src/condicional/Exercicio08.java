package condicional;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.println("Entre com um valor: ");
		numero = scan.nextInt();

		if (numero > 100) {
			System.out.println("O valor digitado: " + numero);
		} else {
			numero = 0;
			System.out.println("O valor digitado " + numero);
		}
		scan.close();
	}
}
