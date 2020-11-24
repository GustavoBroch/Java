package exercicio1;

public class Main {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		dog.setIdade(12);
		dog.setNome("Billy");

		Cavalo horse = new Cavalo();
		horse.setIdade(20);
		horse.setNome("Johns");
		
		Preguica preguica = new Preguica();
		preguica.setIdade(50);
		preguica.setNome("Savor");

		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		System.out.println(dog.deveCorrer());
		System.out.println(dog.emitirSom());

		System.out.println("\n");

		System.out.println("Nome: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade());
		System.out.println(horse.deveCorrer());
		System.out.println(horse.emitirSom());

		System.out.println("\n");

		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade());
		System.out.println(preguica.subirEmArvore());
		System.out.println(preguica.emitirSom());

	}

}
