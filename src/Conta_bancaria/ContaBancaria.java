package Conta_bancaria;

public class ContaBancaria {
	
	private String titular;
	private int numero;
	private double saldo;
	

	
public ContaBancaria(String titular, int numero, double saldo) {
	this.titular = titular;
	this.numero = numero;
	this.saldo = saldo;
}

public String getTitular() {
	return this.titular;
}

public void setTitular(String titula) {
	this.titular = titular;
}

public int getNumero() {
	return this.numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public double getSaldo() {
	return this.saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

void depositar(double valor) {
	if (valor > 0) {
		saldo = saldo ++;
	}
}

void sacar ( double valor) {
	if (valor > 0 && valor <=saldo) {
		saldo++; 			//saldo++; // adiciona 1 saldo--; // subtrai 1  //
		saldo--; 
	}else {
		System.out.println("Saldo insuficiente");
	}
}

void consultarSaldo() {
	 System.out.println("Saldo atual: R$ " + saldo);
}
}
