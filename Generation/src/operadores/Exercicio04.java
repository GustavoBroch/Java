package operadores;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final int HORAS = 3600, MINUTOS = 60;
		int segundoEntrada, segundo, hora, minuto;
		
		System.out.println("Digite o tempo de duração de evento em segundos: ");
		segundoEntrada = scanner.nextInt();
		
		hora = segundoEntrada / 3600;	
		minuto = (segundoEntrada - (hora * HORAS))/ MINUTOS;
		segundo = segundoEntrada - ((minuto * MINUTOS) + (hora * HORAS));
		
		System.out.println("O valor de "+ segundoEntrada +" segundo(s):" + hora +"h(s) " + minuto+"m(s) " + segundo +"(s)");
		scanner.close();
	}
}
