package Produtos;

public class Produto_main {

	public static void main(String[] args) {

		Produto p1 = new Produto("Café", 20.00f, 1);
		Produto p2 = new Produto("Arroz" , 5.00f, 2);
		Produto p3 = new Produto("Ração", 50.00f, 1);
		Produto p4 = new Produto("Detergente" ,10.00f, 5);
		Produto p5 = new Produto("Shampoo", 35.00f, 6);
		
		p1.adicionarEstoque(10);
		p2.adicionarEstoque(5);
		p1.calcularValorTotal();
		p2.calcularValorTotal();
		p1.exibirDados();
		p2.exibirDados();
		
		

	}

}
