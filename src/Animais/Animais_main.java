package Animais;

public class Animais_main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Duque", 1 );
		Gato gato = new Gato ("Romeu", 2);

		
		cachorro.emitirSom();
		gato.emitirSom();	}

}
