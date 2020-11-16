package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
				
		String codigo;
		int numeroHoras, salario, excesso;
	
		System.out.println("Entre com código do funcionário: ");
		codigo = ler.nextLine();
		
		System.out.println("Entre o número de horas trabalhadas: ");
		numeroHoras = ler.nextInt();
		
		if(numeroHoras > 50) {
			
			excesso = numeroHoras - 50;
			salario = excesso * 20 + (numeroHoras - excesso) * 10;
			
			System.out.printf("\nO código do funcionário é: %s", codigo);
			System.out.printf("\nO excesso de horas: %d", excesso);
			System.out.printf("\nO salário final: %d", salario);
		}else if( numeroHoras < 0) {
			
			System.out.println("Valor de horas inválido");
		}else {
			
			excesso = 0;
			salario =  numeroHoras * 10;
			
			System.out.printf("\nO código do funcionário é: %s", codigo);
			System.out.printf("\nO excesso de horas: %d", excesso);
			System.out.printf("\nO salário final: %d", salario);
		}
		ler.close();
		
		
		
	}
}
