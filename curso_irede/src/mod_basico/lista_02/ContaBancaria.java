package lista_02;

public class ContaBancaria {
	
	private String numero;
	private String nome_titular;
	private Double saldo;
	public ContaBancaria(String numero, String nome_titular, Double saldo) {
		this.numero = numero;
		this.nome_titular = nome_titular;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNome_titular() {
		return nome_titular;
	}
	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void depositar(Double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public void sacar(Double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Valor inválido");
		}
	}
	
}
