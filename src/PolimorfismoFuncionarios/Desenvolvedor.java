package PolimorfismoFuncionarios;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void calcularSalario() {
		float salarioFinal = getSalario() * 1.10f;
		System.out.println("O salario do desenvolvedor é: " + salarioFinal);
	}
}
