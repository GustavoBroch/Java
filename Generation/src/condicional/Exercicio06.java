package condicional;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Categoria: Infantil A");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Categoria: Infantil B");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Categoria: Juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		}else if(idade >= 18) {
			System.out.println("Categoria: Adultos");
		}else {
			System.out.println("Categoria: Inválida");
		}
		
		leia.close();
	}

}
