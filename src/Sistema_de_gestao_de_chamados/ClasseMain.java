package Sistema_de_gestao_de_chamados;

public class ClasseMain {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(6, "Sarah", "sarah@gmail.com", "5585544885");
		Tecnico tecnico = new Tecnico(8 ,"Vitor", "Infraestrutura", "DISPONIVEL");
		Chamado chamado = new Chamado (1,"Computador não liga", "O computador não liga ao pressionar o botão.","ABERTO","BAIXA",cliente,tecnico);
	

       
        chamado.alterarStatus("FECHADO");
        chamado.alterarStatus("EM ANDAMENTO");
        
        chamado.definirPrioridade();

        chamado.exibirDados();
        
	}
	

	}

