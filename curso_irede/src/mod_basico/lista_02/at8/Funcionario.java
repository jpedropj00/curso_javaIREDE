package lista_02.at8;

public abstract class Funcionario {
	public Funcionario(String name, String departamento, Double valorHora) {
		super();
		this.name = name;
		this.departamento = departamento;
		this.valorHora = valorHora;
	}

	protected String name;
	protected String departamento;
	protected Double valorHora;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	public abstract Double calcularSalario(int qtdHoras);
}
