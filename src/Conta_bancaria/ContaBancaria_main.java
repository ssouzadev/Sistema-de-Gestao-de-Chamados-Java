package Conta_bancaria;

public class ContaBancaria_main {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria("João", 325 , 1500 );
		
		
		conta.depositar(100);
		conta.sacar(50);
		conta.consultarSaldo();
	}
	
}
