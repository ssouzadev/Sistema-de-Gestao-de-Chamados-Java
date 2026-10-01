package PolimorfismoFuncionarios;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Sarah", 2000);
		Funcionario desenvolvedor = new Desenvolvedor("Luana", 3000);
		
		gerente.calcularSalario();
		desenvolvedor.calcularSalario();
	}

}
