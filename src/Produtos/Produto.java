package Produtos;


public class Produto {
	
	private String nome;
	private float preco;
	private int quantidade;
	
	public Produto(String nome, float preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return this.preco;

	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	void adicionarEstoque(int quantidade) {
		if(quantidade > 0){
			this.quantidade = quantidade;
		}
	}
	
	void removerEstoque(int quantidade) {
		if(this.quantidade > 0) {
			this.quantidade -= quantidade;
	}else {
		System.out.println("Não pode remover mais produtos do que existe no estoque");
		}
	}
	void calcularValorTotal() {
		System.out.println("Valor total: R$ "+(preco * quantidade)); 
	}
	
	void exibirDados() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total: R$ " + (preco * quantidade));
		System.out.println("----------------------");
		}
	}
