package PolimorfismoFuncionarios;

public class Funcionario {

			private String nome;
			private float salario;
			
public Funcionario (String nome, float salario) {
	this.nome = nome;
	this.salario = salario;
	
	}

public String getNome() {
	return this.nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public float getSalario() {
	return this.salario;
}

public void setSalario(float salario) {
	this.salario = salario;

}

void calcularSalario() {
	
}
}
