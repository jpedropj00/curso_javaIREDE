package lista_02.at8;

public class FuncionarioPJ extends Funcionario{

	public FuncionarioPJ(String name, String departamento, Double valorHora) {
		super(name, departamento, valorHora);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double calcularSalario(int qtdHoras) {
		return qtdHoras * this.valorHora;
	}
}
