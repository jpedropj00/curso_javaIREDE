package lista_02.at10;



public class PagamentoPix extends Pagamento{

	public PagamentoPix(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void processarPagamento() {
		double valorDesconto = 10/100 * this.valor;
		double valorTotal = valor - valorDesconto;
		System.out.println("Pagamento via pix: R$ " + valorTotal);
	}
}
