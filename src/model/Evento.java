package model;

import java.time.LocalDateTime;

public class Evento {

    private String nome;
    private float preco;
    private String area;
    private int capacidade;
    private LocalDateTime dataHora;

    public Evento(String nome, float preco, String area, int capacidade, LocalDateTime dataHora) {
        this.nome = nome;
        this.preco = preco;
        this.area = area;
        this.capacidade = capacidade;
        this.dataHora = dataHora;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public boolean temVagas() {
		return capacidade > 0;
	}
	
	public void aumentarCapacidade(int quantidade) {
		capacidade = capacidade + quantidade;
	}
	
	public void reduzirCapacidade(int quantidade) {
		if (quantidade > capacidade) {
			System.out.println("Capacidade excedida!");
		}else{
			capacidade = capacidade - quantidade;
		}		
	}
	
	public void alterarPreco(float precoAtual) {
		preco = precoAtual;	
	}
	
	public boolean ehEventoCaro() {
		return preco > 200;
	}
	
	public boolean podeReceberMaisPessoas(int quantidade) {
		return quantidade <= capacidade;
	}
	public void venderIngressos(int quantidade) {
		if (quantidade <= capacidade) {
			capacidade = capacidade - quantidade;
		}else{
			System.out.println("Ingressos insuficientes!");
		}
	}
	
	public float calcularValorTotal(int quantidade) {
		return preco * quantidade;
	}
	
	public void aplicarDesconto(float percentual) {
		preco = preco - (preco * percentual / 100);
 }
	
	public boolean precoValido() {
		return preco > 0;
	}
	
	public void exibirDados() {
		System.out.println("--------INFORMAÇÕES DO EVENTOS-------");
		System.out.println();
		System.out.println("Nome do evento: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Área: " + area);
		System.out.println("Capacidade: " + capacidade) ;
		System.out.println("Data e hora " + dataHora);
		System.out.println();
		
 }
}