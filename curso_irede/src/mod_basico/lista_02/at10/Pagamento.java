package lista_02.at10;

public class Pagamento {
	public Pagamento(double valor) {
		super();
		this.valor = valor;
	}

	protected double valor;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void processarPagamento() {
		System.out.println("Processando pagamento genérico de valor: R$" + this.valor);
	}

	public static void main(String[] args) {
		return this.valorHora * qtdHoras;
	}
}
