package Animais;

public class Animal {
	
	private String nome;
	private int idade;
	
	
	public Animal(String nome ,int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
}
	
	
public String getNome() {
	return this.nome = nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

	public int getIdade() {
	return this.idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

void emitirSom() {
	System.out.println("O animal emitiu som!");
	
	}


}
