package lista_02.at6;

public class Gerente extends Funcionario{
	public Gerente(String nome, Double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
		// TODO Auto-generated constructor stub
	}

	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
