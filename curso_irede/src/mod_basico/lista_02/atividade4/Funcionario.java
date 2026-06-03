package lista_02.atividade4;

public class Funcionario extends Pessoa {
	public Funcionario(String nome, String funcao) {
		super(nome);
		this.funcao = funcao;
	}
	
	private String funcao;
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void myFunction() {
		System.out.println("Minha função é " + getFuncao());
	}
	

}
