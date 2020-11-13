package operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		float d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = scanner.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = scanner.nextInt();
		
		r = (float) Math.pow(a + b, 2);
		s = (float) Math.pow(c + b, 2);
		d = (r + s) / 2;
		
		System.out.println("O valor de D: " + d);
		scanner.close();
	}
}
