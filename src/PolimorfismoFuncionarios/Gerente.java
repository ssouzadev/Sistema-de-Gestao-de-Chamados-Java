package PolimorfismoFuncionarios;

public class Gerente extends Funcionario{

	public Gerente(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

@Override
void calcularSalario() {
	float salarioFinal = getSalario() * 1.20f;
	System.out.println("Sálario do gerente: " + salarioFinal);
}
}
