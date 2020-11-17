package condicional2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String senha;

		System.out.println("Entre com a senha: ");
		senha = scan.next();

		if (senha.equals("1234")) {
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso Negado");
		}

		scan.close();
	}

}
