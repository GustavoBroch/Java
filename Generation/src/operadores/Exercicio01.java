package operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		
		final int peso1 = 2, peso2 = 3, peso3 = 5;
		float nota1, nota2, nota3, mediaPonderada; 
		
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
				
		mediaPonderada = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / (peso1 + peso2 + peso3);
		
		System.out.println("A média ponderada: " + mediaPonderada);
		leia.close();
	}
}
