package InterfacePagamento;

public class PagamentoMain{

	public static void main(String[] args) {
		
		Pagamento pagamentoPix = new PagamentoPix();
		Pagamento pagamentoCartao = new PagamentoCartão();
		
		pagamentoPix.pagar(100);
		pagamentoCartao.pagar(50);
		
	}

}
