package exercicio1;

public class Cachorro extends Animal implements AnimaisCorrem{

	@Override
	public String emitirSom() {
		
		return "Au Au";
	}

	@Override
	public String deveCorrer() {
		
		return "Doguinho Correndo";
	}
	

}
