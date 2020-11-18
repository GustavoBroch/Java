package lacos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite o "+ i+"º número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("\nQuantidade par: %d ", par);
		System.out.printf("\nQuantidade impar: %d ", impar);
		leia.close();
	}
}
