package lista_02.at5;

public class Produto {
	private String nome;
	private Integer quantity;
	private Double valor;
	public Produto(String nome, Integer quantity, Double valor) {
		super();
		this.nome = nome;
		this.quantity = quantity;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
