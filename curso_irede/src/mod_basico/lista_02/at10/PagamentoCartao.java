package lista_02.at10;

public class PagamentoCartao extends Pagamento{

	public PagamentoCartao(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void processarPagamento() {
		int VALOR_ACRESCIMO = 5;
		double valorTotal = this.valor + VALOR_ACRESCIMO;
		System.out.println("Pagamento com cartão de crédito: R$ " + valorTotal);
	}
}
