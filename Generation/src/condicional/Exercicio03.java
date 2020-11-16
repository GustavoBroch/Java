package condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		double q1, q2, q3, q4;
		
		System.out.println("Digite o 1º numero: ");
		n1 = leia.nextInt();
		q1 = Math.pow(n1, 2);
		
		System.out.println("Digite o 2º numero: ");
		n2 = leia.nextInt();
		q2 = Math.pow(n2, 2);
		
		System.out.println("Digite o 3º numero: ");
		n3 = leia.nextInt();
		q3 = Math.pow(n3, 2);
		
		System.out.println("Digite o 4º numero: ");
		n4 = leia.nextInt();
		q4 = Math.pow(n4, 2);
		
		if (q3 >= 1000) {
			System.out.println("Numero 3: "+ n3);
			System.out.println("Quadrado do terceiro: " + q3);
		}else {
			
			System.out.println("Numero 1: "+ n1);
			System.out.println("Quadrado do primeiro: " + q1);
			
			System.out.println("Numero 2: "+ n2);
			System.out.println("Quadrado do segundo: " + q2);
			
			System.out.println("Numero 3: "+ n3);
			System.out.println("Quadrado do terceiro: " + q3);
			
			System.out.println("Numero 4: "+ n4);
			System.out.println("Quadrado do quarto: " + q4);
		}
		leia.close();
	}
}
