package lacos;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		System.out.println("N�meros entre 1000 e 1999, que quando dividimos por 11 o resto � 5: ");
		for(int i = 1000; i < 1999; i++) {
			
			if(i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
