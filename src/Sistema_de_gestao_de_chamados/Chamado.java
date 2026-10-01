package Sistema_de_gestao_de_chamados;

public class Chamado {
	
	private int id ;
	private String titulo;
	private String descricao;
	private String status;
	private String prioridade;
	private Cliente cliente;
	private Tecnico tecnico;
	
	public Chamado(int id, String titulo, String descricao, String status, String prioridade, Cliente cliente, Tecnico tecnico) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
		this.prioridade = prioridade;
		this.cliente = cliente;
		this.tecnico = tecnico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
  
	public void exibirDados() {

	    System.out.println("---------- DADOS DO CHAMADO ----------");

	    System.out.println("ID: " + id);
	    System.out.println("Título: " + titulo);
	    System.out.println("Descrição: " + descricao);
	    System.out.println("Status: " + status);
	    System.out.println("Prioridade: " + prioridade);

	    System.out.println();

	    System.out.println("---------- DADOS DO CLIENTE ----------");

	    System.out.println("ID: " + cliente.getId());
	    System.out.println("Nome: " + cliente.getNome());
	    System.out.println("E-mail: " + cliente.getEmail());
	    System.out.println("Telefone: " + cliente.getTelefone());

	    System.out.println();

	    System.out.println("---------- DADOS DO TÉCNICO ----------");

	    System.out.println("ID: " + tecnico.getId());
	    System.out.println("Nome: " + tecnico.getNome());
	    System.out.println("Especialidade: " + tecnico.getEspecialidade());
	    System.out.println("Status: " + tecnico.getStatus());
	}
	
	public void alterarStatus(String novoStatus) {

	    if (status.equals("FECHADO")) {

	        System.out.println("Chamado fechado não pode ter o status alterado.");

	    } else {

	        status = novoStatus;
	    }
	}   
	    public void definirPrioridade() {
	    	if(descricao.contains("não liga")) {
	    		prioridade = "ALTA";
	    	}
	    }
	}
	
	
