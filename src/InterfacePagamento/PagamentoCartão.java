package InterfacePagamento;

public class PagamentoCartão implements Pagamento{

	@Override
	public void pagar(double valor) {
		System.out.println(" Pagamento de " + valor + " realizado via cartão.");
	}

}
