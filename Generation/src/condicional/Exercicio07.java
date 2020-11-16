package condicional;


import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int base, altura, area;

		System.out.println("Entre com a valor da base do triangulo: ");
		base = scan.nextInt();

		System.out.println("Entre com a valor da altura do triangulo: ");
		altura = scan.nextInt();

		if (base > 0 && altura > 0) {
			area = base * altura;
			System.out.println("O valor da area é: " + area);
		} else {
			System.out.println("Valor igual ou abaixo de zero são inválidos");
		}
		scan.close();

	}
}
