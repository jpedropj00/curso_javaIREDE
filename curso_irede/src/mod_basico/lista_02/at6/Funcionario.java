package lista_02.at6;

public class Funcionario {
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	private String nome;
	private Double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
