package lista_02;

public class Aluno {
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	private String nome;
	private Double nota;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		if (nota > 0 && nota <= 10) {
			this.nota = nota;
		} else {
			System.out.println("Nota inválida");
		}
	}
	
}
