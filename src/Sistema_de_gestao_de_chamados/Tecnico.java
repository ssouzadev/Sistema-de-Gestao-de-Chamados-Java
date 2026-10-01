package Sistema_de_gestao_de_chamados;

public class Tecnico {
	
	private int id;
	private String nome;
	private String especialidade;
	private String status;
	
	public Tecnico(int id, String nome, String especialidade, String status) {
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
