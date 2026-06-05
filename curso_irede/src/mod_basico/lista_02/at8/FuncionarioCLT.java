package lista_02.at8;

public class FuncionarioCLT extends Funcionario{

	public FuncionarioCLT(String name, String departamento, Double valorHora) {
		super(name, departamento, valorHora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularSalario(int qtdHoras) { 
		Double valor = qtdHoras * this.valorHora;
		return valor - (10/100 * valor);
	}
}
