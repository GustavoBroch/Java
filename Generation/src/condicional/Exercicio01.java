package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
	
		float pesoTomates, excesso, multa;
				
		System.out.println("Entre com o quilo do tomate: ");
		pesoTomates = ler.nextFloat();
		
		if(pesoTomates > 50 ) {
			
			excesso = pesoTomates - 50;
			multa = excesso * 4.00f;
			
			System.out.printf("\nPeso total dos tomates: %.2fKg", pesoTomates);
			System.out.printf("\nExcesso de quilos: %.2f", excesso);
			System.out.printf("\nMulta: R$%.2f", multa);
		
		}else if(pesoTomates < 0 ) {
			
			System.out.println("Você inseriu um peso inválido ");
		}else {
			excesso = 0;
			multa = 0;
			
			System.out.printf("\nPeso total dos tomates: %.2fKg", pesoTomates);
			System.out.printf("\nExcesso de quilos: %.2f", excesso);
			System.out.printf("\nMulta: R$%.2f", multa);
		}
		ler.close();
		
	}

}
