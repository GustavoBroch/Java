package exercicio1;

public class Cavalo extends Animal implements AnimaisCorrem{

	@Override
	public String emitirSom() {
		
		return "IRRIIIII";
	}

	@Override
	public String deveCorrer() {
		
		return "Trotando";
	}
	

}
