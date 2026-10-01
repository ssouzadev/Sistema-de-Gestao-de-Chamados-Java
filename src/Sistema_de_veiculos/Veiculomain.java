package Sistema_de_veiculos;

public class Veiculomain {

	public static void main(String[] args) {
		
		Veiculo carro = new Carro("Toyota", "corolla", 2011, 4);
		Veiculo moto = new Moto ("Honda", "CG 160,", 2024, 160);
		
		carro.exibirDados();
		moto.exibirDados();
	}

}
