package lista_02.atividade4;

public class Engenheiro extends Funcionario{
	public Engenheiro(String nome, String funcao, String areaAtuacao) {
		super(nome, funcao);
		this.areaAtuacao = areaAtuacao;
	}

	private String areaAtuacao;

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	public void building() {
		System.out.println("Sou engenheiro e trabalho na área " + getAreaAtuacao());
	}
	
}
