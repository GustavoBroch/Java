package operadores;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		final float percentagemDistribuidor = 28f, imposto = 45f;
		float custoFabrica, custoConsumidor;
		
		System.out.println("Digite o valor do custo de fábrica de um carro: ");
		custoFabrica = scanner.nextFloat();
				
		custoConsumidor = custoFabrica * (1 + (percentagemDistribuidor + imposto)/100);
		
		System.out.println("Custo consumidor: R$" + custoConsumidor );
		scanner.close();
	}
	
}
